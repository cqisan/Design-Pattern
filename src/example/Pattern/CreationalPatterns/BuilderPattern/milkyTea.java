package example.Pattern.CreationalPatterns.BuilderPattern;

public class milkyTea extends hotDrink {


    @Override
    public String name() {
        return "奶茶";
    }

    @Override
    public Packing packing() {
        return new hotBottle();
    }

    @Override
    public float price() {
        return 23.0f;
    }
}
