package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/26/18.
 */
public class DrawCircleImplementor implements DrawImplementor {
    private int x;
    private int y;
    private int radius;

    public DrawCircleImplementor(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("this is a circle at " + x + ", " + y + " with radius " + radius);
    }
}
