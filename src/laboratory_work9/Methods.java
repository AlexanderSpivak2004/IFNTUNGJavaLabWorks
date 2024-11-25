package laboratory_work9;

public class Methods {
    public static int add(int a, int b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Both a and b are negative.");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("One variable is 0 and the other is non-zero.");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("Both variables are 0.");
        }
        if (a > 0 && b > 0) {
            throw new MyException("Both variables are positive.");
        }

        return a + b;
    }

    public static int subtract(int a, int b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Both a and b are negative.");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("One variable is 0 and the other is non-zero.");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("Both variables are 0.");
        }
        if (a > 0 && b > 0) {
            throw new MyException("Both variables are positive.");
        }

        return a - b;
    }

    public static int multiply(int a, int b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Both a and b are negative.");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("One variable is 0 and the other is non-zero.");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("Both variables are 0.");
        }
        if (a > 0 && b > 0) {
            throw new MyException("Both variables are positive.");
        }

        return a * b;
    }

    public static double divide(int a, int b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Both a and b are negative.");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("One variable is 0 and the other is non-zero.");
        }
        if (a == 0 && b == 0) {
            throw new IllegalAccessException("Both variables are 0.");
        }
        if (a > 0 && b > 0) {
            throw new MyException("Both variables are positive.");
        }

        return (double) a / b;
    }

    public static void main(String[] args) {
        int[] testCases = {-4, 0, 5};

        for (int a : testCases) {
            for (int b : testCases) {
                try {
                    System.out.println("Adding: " + a + " + " + b + " = " + Methods.add(a, b));
                } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                    System.out.println("Addition error: " + e.getMessage());
                }

                try {
                    System.out.println("Subtracting: " + a + " - " + b + " = " + Methods.subtract(a, b));
                } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                    System.out.println("Subtraction error: " + e.getMessage());
                }

                try {
                    System.out.println("Multiplying: " + a + " * " + b + " = " + Methods.multiply(a, b));
                } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                    System.out.println("Multiplication error: " + e.getMessage());
                }

                try {
                    System.out.println("Dividing: " + a + " / " + b + " = " + Methods.divide(a, b));
                } catch (IllegalArgumentException | ArithmeticException | IllegalAccessException | MyException e) {
                    System.out.println("Division error: " + e.getMessage());
                }

                System.out.println("-------------------------");
            }
        }
    }
}
