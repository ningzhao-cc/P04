package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public abstract class Shape1 {
    protected DrawAPI drawAPI;

    protected Shape1(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
