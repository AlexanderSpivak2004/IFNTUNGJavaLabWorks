package laboratory_work12_2;

import java.io.*;

public class Main {
    public static void binaryToTextDataConverter() {
        String inputFile = "MyBinFile.bin";
        String outputFile = "MyTextFile.txt";

        try (
                FileInputStream fileInputStream = new FileInputStream(inputFile);
                FileWriter fileWriter = new FileWriter(outputFile);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFile))
        ) {

            // Read bytes from the input file and convert them to characters, appending them to the string
            String stringData = "";
            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                stringData += (char) byteData;
            }

            System.out.println("Binary data from " + inputFile + ": \n" + stringData);

            String[] symbols = stringData.split(" ");

            // Write characters converted from numeric values in string format
            for (String symbol : symbols) {
                fileWriter.write((char) Integer.parseInt(symbol));
            }

            // Write residual data
            fileWriter.flush();

            // Read file by lines and print it
            System.out.println("Text data from " + inputFile + ":");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            System.out.println("Error: " + ioException.getMessage());
        }
    }

    public static void main(String[] args) {
        binaryToTextDataConverter();
    }
}