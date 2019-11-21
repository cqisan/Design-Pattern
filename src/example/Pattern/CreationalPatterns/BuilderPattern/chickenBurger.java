package example.Pattern.CreationalPatterns.BuilderPattern;

public class chickenBurger extends Burger {


    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }


    @Override
    public Packing packing() {
        return new BurgerBox();
    }
}
