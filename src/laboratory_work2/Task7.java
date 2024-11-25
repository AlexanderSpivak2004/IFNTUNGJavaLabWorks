package laboratory_work2;

import java.util.Scanner;

public class Task7 {
    public static String task7() {
        /* Створити програму, яка перетворює введене користувачем
         десяткове число у двійкову систему числення. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number in decimal form: ");
        if (!scanner.hasNextInt()) {
            return "Error!";
        }
        int number = scanner.nextInt();

        return Integer.toBinaryString(number);
    }
}
