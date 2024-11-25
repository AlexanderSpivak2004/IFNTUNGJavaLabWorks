package laboratory_work2;

import java.util.Scanner;

public class Task11 {
    public static boolean task11() {
        /* Створити програму, яка перевіряє, чи є введений користувачем рядок
         паліндромом. Пробіли та регістр символів не враховувати. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.nextLine().replace(" ", "");

        StringBuilder reversedWord = new StringBuilder(word).reverse();

        return (word.equalsIgnoreCase(reversedWord.toString()));
    }
}
