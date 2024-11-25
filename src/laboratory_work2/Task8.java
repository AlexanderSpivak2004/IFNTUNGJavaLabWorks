package laboratory_work2;

import java.util.Scanner;

public class Task8 {
    public static boolean task8() {
        /* Створити програму, яка визначає, чи є введене користувачем число
         досконалим. Число вважається досконалим, якщо воно дорівнює сумі
         своїх дільників (крім самого себе). */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error!");
            return false;
        }
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) {
                count += i;
            }
        }

        return count == number;
    }
}
