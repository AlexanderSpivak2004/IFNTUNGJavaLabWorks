package laboratory_work2;

import java.util.Scanner;

public class Task16 {
    public static boolean task16() {
        /* Створити програму, яка перевіряє, чи є введене користувачем число простим. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error!");
            return false;
        }
        int number = scanner.nextInt();

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
