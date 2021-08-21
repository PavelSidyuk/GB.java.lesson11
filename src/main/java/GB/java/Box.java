package GB.java;

import java.util.ArrayList;

public class Box<T extends Fruit> {   // Делаю ограничение, для использования метода getWeight

    public String boxName;

    ArrayList<T> arrayList = new ArrayList<>();

    public void add (T items) {


        if (!arrayList.isEmpty()) { // проверяем есть ли в корзине фрукты

            if (arrayList.get(0).getNameFruit() == items.getNameFruit()) {  // проверяем одинаковые ли фрукты в клрзине и тот что пытаемся положить
                if (!arrayList.contains(items)) { // проверяем не лежит ли этот фрукт уже в корзине
                    arrayList.add(items);

                    System.out.printf("Фрукт %s добавлен в корзину %s\n", items,boxName);
                    System.out.println();
                } else {
                    System.out.printf("Фрукт %s уже лежит в корзине положите другой\n", items);
                    System.out.println();
                }
            } else {
                System.out.println("нельзя положить " + items.getNameFruit() + " в эту корзину та как здесь лежат : " + arrayList.get(0).getNameFruit());
                System.out.println();
            }


        } else { // если корзина пуста то добовляем фрукт

            arrayList.add(items);

            System.out.printf("Фрукт %s добавлен в корзину %s\n", items,boxName);
            System.out.println();
        }

    }


    public float getWeight () {

        if (!arrayList.isEmpty()) {

            for (int i = 0; i < arrayList.size(); i++) {
                float weightBox;
                weightBox = arrayList.get(0).getWeight() * arrayList.size();
                // System.out.println("Вес коробки с фруктами :" + " = " + weightBox);  // в задании не указанно что эти данные нужно выводить
                // System.out.println();

                return weightBox;
            }

        } else {
            System.out.println("Коробка пуста");
            System.out.println();
            return 0;
        }

        return 0;
    }

    public boolean compare (Box box) {
        if ((this.getWeight() - box.getWeight()) != 0) {
            System.out.println(" Вес не равен false");
            System.out.println();

            return false;

        } else {

            System.out.println("Вес  равен true");
            System.out.println();
            return true;
        }


    }

    public Box (String boxName) {
        this.boxName = boxName;
    }

    public void transfer(Box<T> nextBox){
        if (!(arrayList.isEmpty())){ // проверяем есть ли в коробке и которой будем пересыпать фрукты
            if (!(nextBox.arrayList.isEmpty())){ // проверяем есть ли фрукты в коробке в которую планируем перекладывать
                if(nextBox.arrayList.get(0).getNameFruit() == arrayList.get(0).getNameFruit()){// проверяем одинаковые ли фрукты
                    System.out.println("Пересыпаем из коробки :" + boxName + "в коробку :" + nextBox.boxName);
                    nextBox.arrayList.addAll(arrayList);
                    System.out.println(nextBox.arrayList);
                }else {
                    System.out.println("В кробке " + boxName + " лежат " + arrayList.get(0).getNameFruit() +
                            " Вы неможете их переложить в коробку с " + nextBox.arrayList.get(0).getNameFruit());
                }
            }else {// если коробка пуста, то просто пересыпаем.
                System.out.println("Пересыпаем из коробки :" + boxName + "в коробку :" + nextBox.boxName);
                nextBox.arrayList.addAll(arrayList);
                System.out.println(nextBox.arrayList);
            }

        }else {
            System.out.println(" Вы пытаетесь пресыпать фрукты из пустой корбке, вам нужно обратиться к врачу");
        }
    }


}
