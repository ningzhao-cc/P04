package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/9/18.
 */
public class RedCircle extends ColorShape {
    protected ColorShapeImplementor colorShapeImplementor;

    public void setColorShapeImplementor(ColorShapeImplementor impl) {
        colorShapeImplementor = impl;
    }

    public RedCircle(ColorShapeImplementor colorShapeImplementor) {
        super();
        this.colorShapeImplementor = colorShapeImplementor;
        colorShapeImplementor.setColorType(ColorType.RED);
        colorShapeImplementor.setShapeType(ShapeType.CIRCLE);
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
