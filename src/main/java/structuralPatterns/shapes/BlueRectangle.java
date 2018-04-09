package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorImplementor;
import structuralPatterns.bridgePattern.ColorShapeImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/5/18.
 */
public class BlueRectangle extends ColorShape {
    //private ShapeType shapeType;
    //private ColorType colorType;

    protected ColorShapeImplementor colorShapeImplementor;

    public void setColorShapeImplementor(ColorShapeImplementor impl) {
        colorShapeImplementor = impl;
    }

    public BlueRectangle(ColorShapeImplementor colorShapeImplementor) {
        super();
        this.colorShapeImplementor = colorShapeImplementor;
        colorShapeImplementor.setColorType(ColorType.BLUE);
        colorShapeImplementor.setShapeType(ShapeType.RECTANGLE);
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

    public void setParam(int[] args) {
        colorShapeImplementor.setParam(args);
    }

    public double getArea() {
        return colorShapeImplementor.getArea();
    }

    public void print() {
        colorShapeImplementor.print();
    }
}
