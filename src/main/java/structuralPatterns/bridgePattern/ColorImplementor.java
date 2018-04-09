package structuralPatterns.bridgePattern;

import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/8/18.
 */
public interface ColorImplementor {
    void setColorType(ColorType colorType);
    ColorType getColorType();
}
