package laboratory_work2;

import java.util.Scanner;

public class Task4 {
    public static int task4() {
        /* Створити програму, яка по введеному цілому числу вираховує
         значення ряду: 1*2 + 2*3*4 + … + n*(n + 1)* … *2n. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error!");
            return 0;
        }
        int number = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= number; i++)
        {
            int product = 1;

            for (int j = i; j <= i * 2; j++) {
                product *= j;
            }

            result += product;
        }

        return result;
    }
}
