package laboratory_work2;

import java.util.Scanner;

public class Task10 {
    public static String task10() {
        /* Створити програму, яка виводить на екран таблицю множення
         від 1 до 10 для введеного користувачем числа. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!scanner.hasNextInt()) {
            return "Error!";
        }
        int number = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            result.append(number).append(" * ").append(i).append(" = ").append(number * i).append("\n");
        }

        return result.toString();
    }
}
