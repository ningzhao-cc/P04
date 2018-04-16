package structuralPatterns.decoratorPattern;

/**
 * Created by Ning on 4/16/18.
 */
public class FrameDecorator extends Decorator {
    Drawer drawer;

    public FrameDecorator(Drawer drawer) {
        this.drawer = drawer;
    }

    public String draw() {
        return drawer.draw() + ", add a frame";
    }
}
