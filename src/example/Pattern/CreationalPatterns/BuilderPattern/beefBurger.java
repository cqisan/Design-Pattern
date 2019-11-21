package example.Pattern.CreationalPatterns.BuilderPattern;

public class beefBurger extends Burger {

    @Override
    public Packing packing() {
        return new BurgerBox();
    }

    @Override
    public String name() {
        return "牛肉汉堡";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
