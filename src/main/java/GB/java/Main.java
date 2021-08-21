package GB.java;

public class Main {


    public static void main (String[] args) {
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();


        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();


        Box box = new Box("1");
        Box box1 = new Box("2");



        box1.add(apple);
        box1.add(apple1);
        box1.add(apple2);

        box.add(orange1);
        box.add(orange);

        box1.getWeight();
        box.compare(box1);
        box.transfer(box1);

    }
}
