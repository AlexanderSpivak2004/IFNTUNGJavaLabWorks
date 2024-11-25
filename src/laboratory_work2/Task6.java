package laboratory_work2;

import java.util.Scanner;

public class Task6 {
    public static boolean isPrime(int number) {
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

    public static String task6() {
        /* Створити програму, яка б знаходила прості числа. Число вважається простим,
         якщо воно ділиться тільки на 1 та на саме себе. Кількість знайдених простих
         чисел обмежити числом введеним із клавіатури. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of prime numbers: ");
        if (!scanner.hasNextInt()) {
            return "Error!";
        }
        int limit = scanner.nextInt();

        int count = 0;
        int number = 2;
        StringBuilder result = new StringBuilder();

        while (count < limit) {
            if (isPrime(number)) {
                result.append(number).append(" ");
                count++;
            }
            number++;
        }

        return result.toString();
    }
}
