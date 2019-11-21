package example.Pattern.StructuralPatterns.BridgePattern;

public class BCircle extends BShape {

    private int x, y, radius;

    public BCircle(int x, int y, int radius, DrawAPI drawAPI) {

        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
