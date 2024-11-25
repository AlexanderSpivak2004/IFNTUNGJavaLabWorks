package laboratory_work9;

import java.util.Scanner;
import javax.management.relation.InvalidRoleValueException;

public class Main {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");

        try {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                throw new Exception("The variable cannot be empty");
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        } finally {
            System.out.println("Program ended");
        }
    }

    public static void task2(Object variable) {
        try {
            if (variable == null) {
                throw new NullPointerException("An argument of the function can not be null");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Exception: " + nullPointerException.getMessage());
        }
    }

    public static long task3(Object number) {
        try {
            if (!(number instanceof Integer)) {
                throw new InvalidRoleValueException("Value should be only Integer");
            }
            if ((Integer) number < 1) {
                throw new IllegalArgumentException("Value should be positive and smaller than 66");
            }
        } catch (InvalidRoleValueException invalidRoleValueException) {
            System.out.println("Exception: " + invalidRoleValueException.getMessage());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Exception: " + illegalArgumentException.getMessage());
        }

        if ((Integer) number == 1) {
            return 1;
        }

        return (Integer) number * task3((Integer) number - 1);
    }

    public static void main(String[] args) {
        //task1();
        //task2(null);
        //System.out.println(task3(5));
        //IntegerReceiver.integerReceiver();
        //System.out.println(ArithmeticCalculations.task5());
        //System.out.println(ArithmeticCalculations.task6());
        //System.out.println(ArithmeticCalculations.task7());
        //System.out.println(ArithmeticCalculations.task8());
        //System.out.println(ArithmeticCalculations.task9());
        //System.out.println(ArithmeticCalculations.task10());
    }
}