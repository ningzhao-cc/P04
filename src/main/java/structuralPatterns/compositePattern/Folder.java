package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 6/11/18.
 */
public class Folder extends AbstractFileComponent {
    private String name;
    private List<AbstractFileComponent> componentList;

    public Folder(String name) {
        this.name = name;
        this.componentList = new ArrayList<AbstractFileComponent>();
    }

    @Override
    public void print(int depth) {
        StringBuilder sb = new StringBuilder();

        int curDepth = 0;
        while (curDepth++ < depth) {
            sb.append("--");
        }

        System.out.println(sb.toString() + this.getName());

        for (AbstractFileComponent c : componentList) {
            c.print(depth + 2);
        }
    }

    @Override
    public void add(AbstractFileComponent component) {
        componentList.add(component);
    }

    @Override
    public void delete(AbstractFileComponent componenet) {
        componentList.remove(componenet);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
