package laboratory_work2;

import java.util.Scanner;

public class Task3 {
    public static boolean task3() {
        /* Створити програму, яка перевірятиме, чи є введене користувачем слово з п'яти
         букв, паліндромом (наприклад «ротор»). Якщо введено слово не з 5 букв, то
         повідомити про помилку. Програма повинна правильно працювати зі словом, навіть
         у випадку, якщо в ньому використані символи різного регістру. Наприклад, слова
         «Ротор» або «рОТоР» слід також вважати паліндромами. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word (5 letters): ");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            System.out.println("The word must have exactly 5 letters.");
            return false;
        }

        StringBuilder reversedWord = new StringBuilder(word).reverse();

        return (word.equalsIgnoreCase(reversedWord.toString()));
    }
}
