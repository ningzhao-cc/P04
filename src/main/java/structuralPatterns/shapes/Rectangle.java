package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/5/18.
 */
public class Rectangle extends Shape {
    private int x;
    private int y;
    private ShapeType shapeType;


    //public Rectangle() {
    //    super();
    //};

    //public Rectangle(int x, int y) {
    //    this.x = x;
    //    this.y = y;
    //}


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setParam(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public int getArea() {
        return x * y;
    }

    protected ShapeImplementor shapeImplementor;

    public void setShapeImplementor(ShapeImplementor impl) {
        shapeImplementor = impl;
    }

    public Rectangle(ShapeImplementor shapeImplementor) {
        super(shapeImplementor);
    }

    public void setShapeType(ShapeType shapeType) {
        shapeImplementor.setShapeType(shapeType);
    }

    public ShapeType getShapeType() {
        return shapeImplementor.getShapeType();
    }

    public ColorType getColorType() {
        return null;
    }
}
