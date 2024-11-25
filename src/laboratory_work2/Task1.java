package laboratory_work2;

import java.util.Scanner;

public class Task1 {
    public static String task1()
    {
        /* Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем з клавіатури,
        парне або непарне. Якщо користувач введе не ціле число, то вивести повідомлення про помилку. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (!scanner.hasNextInt()) {
            return "Error! You have entered not the integer.";
        }
        int number = scanner.nextInt();

        return (number % 2 == 0) ? "The number is even." : "The number is odd.";
    }
}
