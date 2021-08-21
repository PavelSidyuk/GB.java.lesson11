package GB.java;

public class Apple extends Fruit  {

    public Apple (String nameFruit, float weight) {
        super("Apple", 1.0f);
    }

    @Override
    public String getNameFruit () {
        return super.getNameFruit();
    }





    public Apple () {
        super("Apple", 1.0f);
    }

    @Override
    public String toString () {
        return super.toString();
    }

    @Override
    public float getWeight () {

        return 1.0f;
    }





}
