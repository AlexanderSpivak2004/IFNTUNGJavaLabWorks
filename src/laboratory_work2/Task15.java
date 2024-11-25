package laboratory_work2;

import java.util.Scanner;

public class Task15 {
    public static int task15() {
        /* Створити програму, яка знаходить суму всіх парних чисел
        в діапазоні від 1 до введеного користувачем числа. */

        Scanner scanner = new Scanner(System.in);

        // Введення числа від користувача
        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
        }
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        }

        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        return result;
    }
}
