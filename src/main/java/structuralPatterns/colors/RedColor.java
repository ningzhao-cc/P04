package structuralPatterns.colors;

import structuralPatterns.bridgePattern.ColorImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;

/**
 * Created by Ning on 4/9/18.
 */
public class RedColor extends Color {
    protected ColorImplementor colorImplementor;

    public RedColor(ColorImplementor colorImplementor) {
        super();
        this.colorImplementor = colorImplementor;
        colorImplementor.setColorType(ColorType.RED);
    }

    public void print() {
        colorImplementor.print();
    }
}
