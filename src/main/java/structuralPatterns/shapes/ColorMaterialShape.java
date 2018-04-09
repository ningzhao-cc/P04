package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorMaterialShapeImplementor;
import structuralPatterns.colors.ColorType;
import structuralPatterns.materials.MaterialType;

/**
 * Created by Ning on 4/9/18.
 */
public abstract class ColorMaterialShape extends ColorShape {
    private ShapeType shapeType;
    private ColorType colorType;
    private MaterialType materialType;

    private ColorMaterialShapeImplementor impl;


    public double getArea() {
        return 0;
    }

    public void print() {

    }

    public ColorMaterialShape() {}

    public ColorMaterialShape(ColorMaterialShapeImplementor colorMaterialShapeImplementor) {
        this.impl = colorMaterialShapeImplementor;
    }

    public void setImpl(ColorMaterialShapeImplementor colorMaterialShapeImplementor) {
        this.impl = colorMaterialShapeImplementor;
    }

    public void setMaterialType(MaterialType materialType) {

    }

    public MaterialType getMaterialType() {
        return materialType;
    }
}
