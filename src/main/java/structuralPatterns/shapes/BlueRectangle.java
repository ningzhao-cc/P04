package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorImplementor;
import structuralPatterns.bridgePattern.ColorShapeImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/5/18.
 */
public class BlueRectangle extends ColorShape {
    private int x;
    private int y;
    private ShapeType shapeType;
    private ColorType colorType;

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

    protected ColorShapeImplementor colorShapeImplementor;

    public void setShapeImplementor(ColorShapeImplementor impl) {
        colorShapeImplementor = impl;
    }

    public BlueRectangle(ColorShapeImplementor colorShapeImplementor) {
        super(colorShapeImplementor);
    }

    public void setShapeType(ShapeType shapeType) {
        colorShapeImplementor.setShapeType(shapeType);
    }

    public ShapeType getShapeType() {
        return colorShapeImplementor.getShapeType();
    }

    public void setColorType(ColorType colorType) {
        colorShapeImplementor.setColorType(colorType);
    }

    public ColorType getColorType() {
        return colorShapeImplementor.getColorType();
    }
}
