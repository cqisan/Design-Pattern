package example.Pattern.BehavioralPatterns.CommandPattern;

public enum CommandPatternDemo {


    Instance;

    private CommandPatternDemo() {
    }

    public void doCommand() {

        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }


}
