package laboratory_work2;

import java.util.Scanner;

public class Task9 {
    public static int task9() {
        /* Створити програму, яка знаходить найбільший спільний дільник
         двох цілих чисел, введених користувачем з клавіатури. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error");
            return 0;
        }
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error");
            return 0;
        }
        int number2 = scanner.nextInt();

        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return number1;
    }
}
