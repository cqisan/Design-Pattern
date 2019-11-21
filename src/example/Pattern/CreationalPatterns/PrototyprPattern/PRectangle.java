package example.Pattern.CreationalPatterns.PrototyprPattern;

public class PRectangle  extends PShape {


    public PRectangle(){
        type = "P Rectangle";
    }


    @Override
    void draw() {
        System.out.println("Inside P Rectangle::draw() method.");
    }
}
