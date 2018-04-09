package structuralPatterns.shapes;

import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/5/18.
 */
public class Rectangle extends Shape {
    //private int x;
    //private int y;
    //private ShapeType shapeType;


    //public Rectangle() {
    //    super();
    //};

    //public Rectangle(int x, int y) {
    //    this.x = x;
    //    this.y = y;
    //}
    public void setParam(int [] args) {
        shapeImplementor.setParam(args);
    }

    public double getArea() {
        return shapeImplementor.getArea();
    }


    protected ShapeImplementor shapeImplementor;

    public void setShapeImplementor(ShapeImplementor impl) {
        shapeImplementor = impl;
    }

    public Rectangle(ShapeImplementor shapeImplementor) {
        super();
        this.shapeImplementor = shapeImplementor;
        shapeImplementor.setShapeType(ShapeType.RECTANGLE);
    }

    public void setShapeType(ShapeType shapeType) {
        shapeImplementor.setShapeType(shapeType);
    }

    public ShapeType getShapeType() {
        return shapeImplementor.getShapeType();
    }

    public ColorType getColorType() {
        return null;
    }

    public void print() {
        shapeImplementor.print();
    }

    // //rectangle is initialized or not
    //public void print() {
    //    System.out.println("the shape is : " + shapeType.toString() + " and the color is : " +
    //            null  + " and the area is : " + this.getArea());
    //}
}
