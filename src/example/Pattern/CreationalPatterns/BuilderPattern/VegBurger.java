package example.Pattern.CreationalPatterns.BuilderPattern;

public class VegBurger extends Burger {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 20.0f;
    }


    @Override
    public String name() {
        return "蔬菜汉堡";
    }
}
