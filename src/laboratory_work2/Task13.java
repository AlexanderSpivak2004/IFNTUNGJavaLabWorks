package laboratory_work2;

import java.util.Scanner;

public class Task13 {
    public static int task13() {
        /* Створити програму, яка знаходить максимальний елемент в
        масиві цілих чисел, введеному користувачем з клавіатури. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error!");
            return 0;
        }
        int sizeArray = scanner.nextInt();

        int[] numbers = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];

        for (int i = 1; i < sizeArray; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
