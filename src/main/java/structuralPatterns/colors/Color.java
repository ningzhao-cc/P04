package structuralPatterns.colors;

/**
 * Created by Ning on 4/5/18.
 */
public abstract class Color {
    private ColorType colorType;
    public void setColor(ColorType colorType) {
        this.colorType = colorType;
    }
    public ColorType getColorType() {
        return colorType;
    }
}
