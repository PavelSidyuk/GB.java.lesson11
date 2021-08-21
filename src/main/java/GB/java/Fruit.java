package GB.java;


public abstract class Fruit {

    private final String nameFruit; // делаю тип фрукта файнал для того чтобы потом использовать при срвнение фруктов в корзине
    private float weight;

//


    public Fruit (String nameFruit, float weight) {
        this.nameFruit = nameFruit;
        this.weight = weight;
    }


    public String getNameFruit () {
        return nameFruit;
    }



    @Override
    public String toString () {
        return
                nameFruit + " " +
                        "весом " + weight;
    }



    public abstract float getWeight ();
}
