package structuralPatterns.bridgePattern;

import structuralPatterns.shapes.Shape;
import structuralPatterns.shapes.ShapeType;

import static structuralPatterns.shapes.ShapeType.CIRCLE;
import static structuralPatterns.shapes.ShapeType.RECTANGLE;
import static structuralPatterns.shapes.ShapeType.TRIANGLE;

/**
 * Created by Ning on 4/6/18.
 */
public interface ShapeImplementor {
    void setShapeType(ShapeType shapeType);
    ShapeType getShapeType();
    double getArea();
    void print();
    void setParam(int[] args);
}
