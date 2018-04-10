package structuralPatterns.bridgePattern;

import structuralPatterns.colors.ColorType;
import structuralPatterns.shapes.ShapeType;

/**
 * Created by Ning on 4/8/18.
 */
public class ColorShapeImplementor implements ColorImplementor, ShapeImplementor {
    private ColorType colorType;
    private ShapeType shapeType;
    private int[] params;

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

    public void setParam(int[] args) {
        this.params = args;
    }

    public double getArea() {
        if (shapeType == null) {
            return 0;
        }

        switch (shapeType) {
            case CIRCLE:
                return  Math.PI * params[0] * params[0];
            case RECTANGLE:
                return params[0] * params[1];
            case TRIANGLE:
                double p = (params[0] + params[1] + params[2]) / 2;
                return Math.sqrt(p * (p - params[0]) * (p - params[1]) * (p - (params[2])));
            default:
                return 0;
        }
    }

    public void print() {
        System.out.println("the shape is : " + (shapeType == null ? null : shapeType.toString()) + " and the color is : " +
                (colorType == null ? null : colorType.toString())  + " and the area is : " + getArea());
    }
}
