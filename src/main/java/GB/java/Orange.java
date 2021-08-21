package GB.java;

public class Orange extends Fruit  {

    public Orange () {
        super("Orange",1.5f);
    }

    public Orange (String nameFruit, float weight) {
        super("Orange", 1.5f);
    }

    @Override
    public String getNameFruit () {
        return super.getNameFruit();
    }






    @Override
    public String toString () {
        return super.toString();
    }

    @Override
    public float getWeight () {
        return 1.5f;
    }



}
