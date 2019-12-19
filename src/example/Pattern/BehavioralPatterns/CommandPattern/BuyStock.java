package example.Pattern.BehavioralPatterns.CommandPattern;

/**
 * Order 接口的实体类
 */
public class BuyStock implements Order {

    private Stock abcStock;


    public BuyStock(Stock abcStock) {

        this.abcStock = abcStock;
    }


    public void execute() {
        abcStock.buy();
    }


}
