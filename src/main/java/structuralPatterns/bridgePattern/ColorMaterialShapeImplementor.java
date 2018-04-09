package structuralPatterns.bridgePattern;

import structuralPatterns.colors.ColorType;
import structuralPatterns.materials.MaterialType;
import structuralPatterns.shapes.ShapeType;

/**
 * Created by Ning on 4/9/18.
 */
public class ColorMaterialShapeImplementor implements ColorImplementor, ShapeImplementor, MaterialImplementor {
    private ColorType colorType;
    private MaterialType materialType;
    private ShapeType shapeType;
    private int[] params;

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public double getArea() {
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
        System.out.println("the shape is : " + (shapeType == null ? null : shapeType.toString()) +
                " and the color is : " + (colorType == null ? null : colorType.toString())  +
                " and the material is : " + (materialType == null ? null : materialType.toString()) +
                " and the area is : " + getArea());
    }

    public void setParam(int[] args) {
        this.params = args;
    }
}
