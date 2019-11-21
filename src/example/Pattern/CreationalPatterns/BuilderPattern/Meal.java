package example.Pattern.CreationalPatterns.BuilderPattern;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Meal implements SetMenu {
    private List<Item> items = new ArrayList<Item>();


    @Override
    public void addItem(@NotNull Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(@NotNull Item item) {
        items.remove(item);

    }

    @Override
    public float cost() {

        float cc = 0.0f;

        for (Item i : items) {
            cc += i.price();
        }

        return cc;
    }

    @Override
    public void showItems() {


        for(Item i:items){
            System.out.println(i.toString());
        }
        System.out.println("Meal price is "+cost());
        System.out.println("------------------------------------");
    }

    @Override
    public void clear() {
        items.clear();
    }
}
