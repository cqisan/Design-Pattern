package example.Pattern.CreationalPatterns.BuilderPattern;

public class Coke extends  coldDrink {

    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public Packing packing() {
        return new coldBottle();
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
