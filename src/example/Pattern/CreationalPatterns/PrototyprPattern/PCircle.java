package example.Pattern.CreationalPatterns.PrototyprPattern;

public class PCircle extends PShape {

    public PCircle() {
        type = "P Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
