package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public class Circle extends Shape1{
    private int radius, x, y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
