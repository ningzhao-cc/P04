package structuralPatterns.decoratorPattern;

/**
 * Created by Ning on 4/16/18.
 */
public class ColorDecorator extends Decorator {
    Drawer drawer;

    public ColorDecorator(Drawer drawer) {
        this.drawer = drawer;
    }

    public String draw() {
        return drawer.draw() + ", add a background color";
    }
}
