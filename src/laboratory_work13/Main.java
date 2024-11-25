package laboratory_work13;

import java.util.Arrays;

public class Main {
    public static void displayWordCountForEachLine() {
        String[] lines = {
                "Hello World",
                "Java is the programming language",
                "Object Oriented Programming",
                "Code"};

        Arrays.stream(lines).forEach(line -> {
            long wordCount = Arrays.stream(line.split("\\s+")).count();
            System.out.println("Line: \"" + line + "\" contains " + wordCount + " words.");
        });
    }
    public static void main(String[] args) {
        displayWordCountForEachLine();
    }
}
