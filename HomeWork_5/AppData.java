package GeekBrains_Java_QA.HomeWork_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class AppData {

    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public AppData() {
        this.header = new String[]{"Value 1", "Value 2", "Value 3"};
        this.data = new int[][]{{100, 100, 100}, {200, 200, 200}, {300, 300, 300}};
    }

    protected void writeFileCsv(String[] header, int[][] data) {
        try {
            File file = new File("out.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            String stringHeader = String.join(";", header);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(stringHeader);
            for (int[] d : data) {
                String stringData = Arrays.toString(d).replaceAll("\\[|\\]", "");
                printWriter.println(Pattern.compile(",\\s").matcher(stringData).replaceAll(";"));
            }
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected List<TestData> readeFileCsv(String fileName) {
        List<TestData> testData = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String str = in.readLine();
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(";");
                testData.add(new TestData(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return testData;
    }
}
