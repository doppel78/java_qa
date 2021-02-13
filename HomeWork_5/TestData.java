package GeekBrains_Java_QA.HomeWork_5;

public class TestData {

    private int value_1;
    private int value_2;
    private int value_3;

    public TestData(int value_1, int value_2, int value_3) {
        this.value_1 = value_1;
        this.value_2 = value_2;
        this.value_3 = value_3;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "value_1=" + value_1 +
                ", value_2=" + value_2 +
                ", value_3=" + value_3 +
                '}';
    }
}
