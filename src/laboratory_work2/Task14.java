package laboratory_work2;

import java.util.Scanner;

public class Task14 {
    public static int task14() {
        /* Створити програму, яка обчислює факторіал введеного користувачем числа. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error");
            return 0;
        }
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
