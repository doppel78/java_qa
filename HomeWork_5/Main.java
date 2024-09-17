package GeekBrains_Java_QA.HomeWork_5;

public class Main {

    public static void main(String[] args) {
        AppData appData = new AppData();
        String[] header = appData.getHeader();
        int[][] data = appData.getData();
        appData.writeFileCsv(header, data);
        System.out.println(appData.readeFileCsv("out.csv"));
    }
}
