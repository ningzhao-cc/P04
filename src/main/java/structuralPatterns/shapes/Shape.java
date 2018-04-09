package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ShapeImplementor;

/**
 * Created by Ning on 4/5/18.
 */
public abstract class Shape {
    private ShapeType shapeType;
    private ShapeImplementor shapeImplementor;

    public void setShapeType(ShapeType shapeType) {}

    public ShapeType getShapeType() {
        return shapeType;
    }

    public abstract double getArea();

    public Shape(ShapeImplementor shapeImplementor) {
        this.shapeImplementor = shapeImplementor;
    }

    public Shape() {}

    public void setParam(int[] args) {}

    public abstract void print();
}
