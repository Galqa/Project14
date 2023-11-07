import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Напишіть програму, яка виводитиме всю інформацію про клас,
 * користувач сам вибирає, який саме клас цікавить.
 */


public class InfoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести назву класу: "); // наприклад клас Bag
        String className = scanner.nextLine();

        try {
            Class<?> cl = Class.forName(className);
            System.out.println("Ім'я: " + cl.getName());

            System.out.println("\nПоля:");
            Field[] fields = cl.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }
            System.out.println("\nМетоди:");
            Method[] methods = cl.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println("\nКонструктори:");
            Constructor<?>[] constructors = cl.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
