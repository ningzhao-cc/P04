package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public abstract class Shape {
    DrawImplementor impl;

    public abstract void draw();

    // 22
    public abstract void resize(int factor);

    // 33 how about adding more and more features?
    // ResizeImplementor resizeImplementor;
}
