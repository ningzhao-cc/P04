package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorShapeImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/6/18.
 */
public abstract class ColorShape extends Shape {
    private ShapeType shapeType;
    private ColorType colorType;
    private ColorShapeImplementor colorShapeImplementor;

    public ColorShape(ColorShapeImplementor colorShapeImplementor) {
        this.colorShapeImplementor = colorShapeImplementor;
    }

    public ColorShape() {

    }

    public void setColorType(ColorType colorType) {}

    public ColorType getColorType() {
        return colorType;
    }
}
