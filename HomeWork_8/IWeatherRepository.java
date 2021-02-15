package GeekBrains_Java_QA.HomeWork_8;

import java.util.List;

public interface IWeatherRepository {

    List<Weather> getAllData();

    void saveWeatherObject(Weather weather);
}
