package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ColorMaterialShapeImplementor;
import structuralPatterns.colors.ColorType;
import structuralPatterns.materials.MaterialType;

/**
 * Created by Ning on 4/9/18.
 */
public class BluePlasticTriangle extends ColorMaterialShape {

    protected ColorMaterialShapeImplementor impl;

    public void setColorPlasticShapeImplementor(ColorMaterialShapeImplementor impl) {
        this.impl = impl;
    }

    public BluePlasticTriangle(ColorMaterialShapeImplementor impl) {
        super();
        this.impl = impl;
        impl.setColorType(ColorType.BLUE);
        impl.setMaterialType(MaterialType.PLASTIC);
        impl.setShapeType(ShapeType.TRIANGLE);
    }

    public void setShapeType(ShapeType shapeType) {
        impl.setShapeType(shapeType);
    }

    public ShapeType getShapeType() {
        return impl.getShapeType();
    }

    public void setColorType(ColorType colorType) {
        impl.setColorType(colorType);
    }

    public ColorType getColorType() {
        return impl.getColorType();
    }

    public void setMaterialType(MaterialType materialType) {
        impl.setMaterialType(materialType);
    }

    public MaterialType getMaterialType() {
        return impl.getMaterialType();
    }

    public void setParam(int[] args) {
        impl.setParam(args);
    }

    public double getArea() {
        return impl.getArea();
    }

    public void print() {
        impl.print();
    }
}
