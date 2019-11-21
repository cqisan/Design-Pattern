package example.Pattern.CreationalPatterns.AbstractFactoryPattern;


public enum FactoryType {

    Color(0, "颜色工厂", "Color"),
    Shape(1, "形状工厂", "Shape");


    final private int id;
    final private String desc;
    final private String name;

    private FactoryType(int id, String desc, String name) {
        this.id = id;
        this.desc = desc;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }
}
