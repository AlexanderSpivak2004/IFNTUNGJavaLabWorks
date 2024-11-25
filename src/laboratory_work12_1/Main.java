package laboratory_work12_1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void timeFormatChecker() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = null;

        while (time == null) {
            System.out.print("Enter the time in \"HH:mm:ss\" format (example: 15:32:58) : ");

            String input = scanner.nextLine();

            try {
                time = LocalTime.parse(input, formatter);
            } catch (DateTimeParseException dateTimeParseException) {
                System.out.println("Error: " + dateTimeParseException);
            }
        }

        System.out.println("Entered time: " + time);
        System.out.println("Entered hour of the time: " + time.getHour());
        System.out.println("Entered minute: " + time.getMinute());
        System.out.println("Entered second: " + time.getSecond());
    }

    public static void main(String[] args) {
        timeFormatChecker();
    }
}
