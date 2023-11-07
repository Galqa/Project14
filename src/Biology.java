/* Створіть клас, в ньому визначте 3 поля,до цих полів створіть конструктори та методи.
 Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.
 */


import java.lang.reflect.*;

public class Biology {
    private final String plants;
    private final String animals;
    private final String humans;

    public Biology(String plants, String animals, String humans) {
        this.plants = plants;
        this.animals = animals;
        this.humans = humans;
    }

    public String getPlants() {
        return plants;
    }

    public String getAnimals() {
        return animals;
    }

    public String getHumans() {
        return humans;
    }
        public static void main (String[]args){
        Class biologyClass = Biology.class;

        System.out.println("Class Name: " + biologyClass.getName());

        System.out.println("\nFields:");
        Field[] fields = biologyClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        Method[] methods = biologyClass.getMethods();
            for (Method method : methods) {
                System.out.println("Methods:");
                System.out.println("Name: " + method.getName());
                System.out.println("Return type: " + method.getReturnType());
                System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
                System.out.println();
            }

            System.out.println("Constructors:");
            Constructor[] constructors = biologyClass.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Name: " + constructor.getName());
                System.out.println("Parameter types: " + constructor.getParameterTypes());
                System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
                System.out.println();
            }
    }
}