package laboratory_work9;

import java.util.Scanner;

public class IntegerReceiver {
    // Task 4
    public static void integerReceiver() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number (\"exit\" if you want to quit): ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println("You have been entered " + number);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Exception: " + illegalArgumentException.getMessage());
            }
        }
    }
}
