package structuralPatterns.bridgePattern;

import structuralPatterns.colors.ColorType;

/**
 * Created by Ning on 4/8/18.
 */
public interface ColorImplementor {
    public void setColorType(ColorType colorType);
    public ColorType getColorType();
}
