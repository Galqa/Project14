/* Створіть 2 класи, Animal та Cat.
 У класі Animal ініціалізуйте 3 поля різних модифікаторів.
 У класі Cat використовуючи рефлексію, отримайте доступ до полів класу package1.Animal та змініть вміст кожного з полів.
 */
package package1;

import java.lang.reflect.Field;

public class Cat {
    public void changeAnimalFields() {
        try {
            Animal animal = new Animal();

            Field publicField = Animal.class.getDeclaredField("publicField");
            publicField.set(animal, "Goog Field");

            Field protectedField = Animal.class.getDeclaredField("protectedField");
            protectedField.setAccessible(true);
            protectedField.set(animal, "Nice Field");

            Field privateField = Animal.class.getDeclaredField("privateField");
            privateField.setAccessible(true);
            privateField.set(animal, "Beautiful Field");

            System.out.println("publicField: " + publicField.get(animal));
            System.out.println("protectedField: " + protectedField.get(animal));
            System.out.println("privateField: " + privateField.get(animal));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class NewCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.changeAnimalFields();
    }
}



