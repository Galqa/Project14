/* Cтворити клас Bag з полями, методами і конструктором.
 Якщо  сумка woman і red.
 Протестувати програму.
 Цей клас вводимо як користувач в InfoClass, щоб дізнатись всю інформацію про нього.
 */

public class Bag {
    private String type;
    private String color;

    public Bag(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bag{" + "type='" + type + '\'' + ", color='" + color + '\'' + '}';
    }
}
class NewBag {
    public static void main(String[] args) {
        Bag myBag = new Bag("woman", "red");
        System.out.println(myBag);
    }
}
