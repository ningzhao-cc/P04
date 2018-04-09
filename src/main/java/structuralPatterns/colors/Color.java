package structuralPatterns.colors;

import structuralPatterns.bridgePattern.ColorImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.shapes.ShapeType;

/**
 * Created by Ning on 4/5/18.
 */
public abstract class Color {
    private ColorType colorType;
    private ColorImplementor colorImplementor;

    public void setColorType(ColorType colorType) {}

    public ColorType getColorType() {
        return colorType;
    }


    public Color(ColorImplementor colorImplementor) {
        this.colorImplementor = colorImplementor;
    }

    public Color() {}

    public void print() {}
}
