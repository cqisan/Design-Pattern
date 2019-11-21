package example.Pattern.CreationalPatterns.BuilderPattern;


/**
 * 使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 */
public class MealBuilder {


    public  Meal  VegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new milkyTea());
        return meal;
    }

    public Meal CheckenMeal(){

        Meal meal = new Meal();
        meal.addItem(new chickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public  Meal  BeefMeal(){
        Meal meal = new Meal();
        meal.addItem(new beefBurger());
        meal.addItem(new milkyTea());
        return meal;

    }

}
