package laboratory_work11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void checkMandatoryFields(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MandatoryField.class)) {
                field.setAccessible(true);

                Object value = field.get(obj);

                if (value == null) {
                    throw new IllegalAccessException("Field \"" + field.getName() + "\" is mandatory but is not set.");
                }
            }
        }

        System.out.println("All mandatory fields are set for " + obj + ".");
    }

    public static void checkSafeVarargs(Class<?> clazz) {
        // Task 2
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(SafeVarargs.class)) {
                System.out.println("Method \"" + method.getName() + "\" is marked as @SafeVarargs.");
            }
        }
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Alexander");
        user1.setAge(19);
        User user2 = new User("Angelina", 18);
        User user3 = new User();

        // Task1
        try {
            System.out.println("Task 1. Checking for object where all the mandatory fields are set.");
            checkMandatoryFields(user1);
            System.out.println();
            System.out.println("Task 1. Checking for object where all the mandatory fields are set.");
            checkMandatoryFields(user2);
            System.out.println();
            System.out.println("Task 1. Checking for object where not all the mandatory fields are set.");
            checkMandatoryFields(user3);
            System.out.println();
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("Error: " + illegalAccessException);
        }

        System.out.println("\nTask 2.");
        // Task 2
        checkSafeVarargs(User.class);
    }
}
