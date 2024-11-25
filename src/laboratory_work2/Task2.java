package laboratory_work2;

import java.util.Scanner;

public class Task2 {
    public static double task2() {
        /* Створити програму, яка буде виводити на екран менше за
         модулем з трьох введених користувачем дробових чисел. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error!");
            return 0;
        }
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error!");
            return 0;
        }
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error!");
            return 0;
        }
        double number3 = scanner.nextDouble();

        double absNumber1 = Math.abs(number1);
        double absNumber2 = Math.abs(number2);
        double absNumber3 = Math.abs(number3);

        return Math.min(absNumber1, Math.min(absNumber2, absNumber3));
    }
}
