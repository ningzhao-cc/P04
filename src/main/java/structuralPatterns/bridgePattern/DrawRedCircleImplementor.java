package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/27/18.
 */
public class DrawRedCircleImplementor implements DrawImplementor {

    // 11
    //private int x;
    //private int y;
    //private int radius;
    //
    //public DrawRedCircleImplementor(int x, int y, int radius) {
    //    this.radius = radius;
    //    this.x = x;
    //    this.y = y;
    //}
    //
    //public void draw() {
    //    System.out.println("this is a red circle at " + x + ", " + y + " with radius " + radius);
    //}

    //
    //public void setX(int x) {
    //    this.x = x;
    //    return;
    //}
    //
    //public void setY(int y) {
    //    this.y = y;
    //    return;
    //}
    //
    //public void setRadius(int r) {
    //    this.radius = r;
    //    return;
    //}
    //
    //public int getX() {
    //    return x;
    //}
    //
    //public int getY() {
    //    return y;
    //}
    //
    //public int getRadius() {
    //    return radius;
    //}

    // 22
    public void draw(int... i) {
        System.out.println("drawing a Red circle at x = " + i[0] + " y = " + i[1] + " with radius = " + i[2]);
    }
}
