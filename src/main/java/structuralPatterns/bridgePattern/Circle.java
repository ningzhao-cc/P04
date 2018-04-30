package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public class Circle extends Shape {

    // 11
    //private DrawImplementor impl;
    //
    //public Circle(DrawImplementor impl) {
    //    this.impl = impl;
    //}
    //
    //public void drawCircle() {
    //    impl.draw();
    //}
    //
    //public void draw() {
    //    drawCircle();
    //}
    // 11

    //22
    private int x;
    private int y;
    private int radius;
    private DrawImplementor impl;

    public Circle(int x, int y, int radius, DrawImplementor impl) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.impl = impl;
    }

    public void draw() {
        drawCircle();
    }

    public void drawCircle() {
        impl.draw(this.x, this.y, this.radius);
    }


    public void resize(int factor) {
        this.radius *= factor;
    }

    //22
}
