package laboratory_work2;

import java.util.Scanner;

public class Task5 {
    public static int task5()
    {
        /* Створити програму, яка б видаляла із введеного цілого числа вказані
        цифри і виводила на екран новоутворене число. Наприклад число 59015509
        після видалення з нього цифри 5 має перетворитись в число 90109. */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String enteredNumber = scanner.nextLine();
        System.out.print("Enter the symbol you want to delete: ");
        char enteredSymbolToRemove = scanner.next().charAt(0);

        String result = enteredNumber.replace(String.valueOf(enteredSymbolToRemove), "");

        if (result.isEmpty() || !result.matches("-?\\d+")) {
            System.out.println("Error!");
            return 0;
        }

        return Integer.valueOf(result);
    }
}
