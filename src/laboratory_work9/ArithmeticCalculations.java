package laboratory_work9;

import java.util.Scanner;

public class ArithmeticCalculations {
    public static double task5() {
        // b * b * (a - b) / a
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            if (a == 0) {
                throw new ArithmeticException("Number \"a\" must be higher than 0");
            }

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It be an integer");
            }
            b = scanner.nextInt();
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return (double) b * b * (a - b) / a;
    }

    public static double task6() {
        // √(a - b)
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            b = scanner.nextInt();

            if (a - b < 0) {
                throw new ArithmeticException("Root must be a positive number");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return Math.sqrt(a - b);
    }

    public static double task7() {
        // a * √b
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            b = scanner.nextInt();

            if (b < 0) {
                throw new ArithmeticException("Root must be a positive number");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return a * Math.sqrt(b);
    }

    public static double task8() {
        // a * (b - a) / (b + a)
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            b = scanner.nextInt();

            if (b + a == 0) {
                throw new ArithmeticException("A sum of \"a\" and \"b\" numbers must not be zero");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return (double) a * (b - a) / (b + a);
    }

    public static double task9() {
        // √a + √b + √(a + b)
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            b = scanner.nextInt();

            if (a < 0 || b < 0) {
                throw new ArithmeticException("Root must be a positive number");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return Math.sqrt(a) + Math.sqrt(b) + Math.sqrt(a + b);
    }

    public static double task10() {
        // √(a - b) / c
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        try {
            System.out.print("Enter the number \"a\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            a = scanner.nextInt();

            System.out.print("Enter the number \"b\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            b = scanner.nextInt();

            System.out.print("Enter the number \"c\" : ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("It should be an integer");
            }
            c = scanner.nextInt();

            if (a - b < 0) {
                throw new ArithmeticException("Root must be a positive number");
            }

            if (c == 0) {
                throw new ArithmeticException("Number \"c\" can not be zero");
            }

        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Error " + illegalArgumentException);
            return -1;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error " + arithmeticException);
            return -1;
        }

        return Math.sqrt(a - b) / c;
    }
}
