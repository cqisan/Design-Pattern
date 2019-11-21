package example.Pattern.CreationalPatterns.PrototyprPattern;

public class PSquare extends PShape {

    public PSquare(){
        type = "P Square";
    }


    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
