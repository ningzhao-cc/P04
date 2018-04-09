package structuralPatterns.bridgePattern;

import structuralPatterns.colors.ColorType;
import structuralPatterns.shapes.ShapeType;

/**
 * Created by Ning on 4/8/18.
 */
public class ColorShapeImplementor implements ColorImplementor, ShapeImplementor {
    private ColorType colorType;
    private ShapeType shapeType;

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public int getArea() {
        return 0;
    }
}
