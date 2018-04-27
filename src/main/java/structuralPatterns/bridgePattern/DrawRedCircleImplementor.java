package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/27/18.
 */
public class DrawRedCircleImplementor implements DrawImplementor {
    private int x;
    private int y;
    private int radius;

    public DrawRedCircleImplementor(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    public void draw() {
        System.out.println("this is a red circle at " + x + ", " + y + " with radius " + radius);
    }
}
