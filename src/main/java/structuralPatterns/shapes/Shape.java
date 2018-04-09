package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ShapeImplementor;

/**
 * Created by Ning on 4/5/18.
 */
public abstract class Shape {
    private ShapeType shapeType;
    private ShapeImplementor shapeImplementor;

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public abstract int getArea();

    public Shape(ShapeImplementor shapeImplementor) {}

    public void setParam(int x, int y) {}
}
