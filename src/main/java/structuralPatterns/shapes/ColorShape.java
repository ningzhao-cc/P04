package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/6/18.
 */
public abstract class ColorShape extends Shape {
    private ShapeType shapeType;
    private ColorType colorType;

    public ColorShape(ShapeImplementor shapeImplementor) {
        super(shapeImplementor);
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public ColorType getColorType() {
        return colorType;
    }
}
