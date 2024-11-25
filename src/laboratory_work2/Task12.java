package laboratory_work2;

import java.util.Scanner;

public class Task12 {
    public static int task12() {
        /* Створити програму, яка знаходить суму всіх чисел
        Фібоначчі менших за введене користувачем число. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error!");
            return 0;
        }
        int number = scanner.nextInt();

        int a = 0, b = 1, sum = 0;

        while (a < number) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}
