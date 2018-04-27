package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public class Circle extends Shape {
    private DrawImplementor impl;

    public Circle(DrawImplementor impl) {
        this.impl = impl;
    }

    public void drawCircle() {
        impl.draw();
    }

    public void draw() {
        drawCircle();
    }
}
