package structuralPatterns.bridgePattern;

import structuralPatterns.shapes.Shape;
import structuralPatterns.shapes.ShapeType;

/**
 * Created by Ning on 4/6/18.
 */
public interface ShapeImplementor {
    public void setShapeType(ShapeType shapeType);
    public ShapeType getShapeType();
    public int getArea();
}
