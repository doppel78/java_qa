package GeekBrains_Java_QA.HomeWork_7;

public class AppGlobalState {

    private static AppGlobalState instance;

    public String cityName1;

    private String cityKey;

    public String getCityName1() {

        return cityName1;
    }

    public void setCityName1(String cityName1) {

        this.cityName1 = cityName1;
    }

    public String getCityKey() {

        return cityKey;
    }

    public void setCityKey(String cityKey) {

        this.cityKey = cityKey;
    }

    private AppGlobalState() {
    }

    public static AppGlobalState getInstance() {
        if (instance == null) {
            instance = new AppGlobalState();
        }
        return instance;
    }

    public String getApiKey() {

        return "8yTRkRFeG2T8RIydXHoTB7pu2c";
    }
}
