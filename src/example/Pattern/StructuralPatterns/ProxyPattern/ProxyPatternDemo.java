package example.Pattern.StructuralPatterns.ProxyPattern;

public enum  ProxyPatternDemo {

    Instance;

    private ProxyPatternDemo(){

    }


    public void show(){

        Image  image = new ProxyImage("test_image.png");
        image.display();

    }
}
