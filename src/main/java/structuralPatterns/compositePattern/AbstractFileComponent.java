package structuralPatterns.compositePattern;

/**
 * Created by Ning on 6/11/18.
 */
public abstract class AbstractFileComponent {
    abstract void print(int depth);

    // add a component
    abstract void add(AbstractFileComponent component);

    // delete a component
    abstract void delete(AbstractFileComponent component);
}
