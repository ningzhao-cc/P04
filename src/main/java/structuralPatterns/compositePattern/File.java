package structuralPatterns.compositePattern;

/**
 * Created by Ning on 6/11/18.
 */
public class File extends AbstractFileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    void print(int depth) {
        StringBuilder sb = new StringBuilder();
        int curDepth = 0;
        while (curDepth++ < depth) {
            sb.append("--");
        }
        System.out.println(sb.toString() + this.getName());
    }

    @Override
    public void add(AbstractFileComponent component) {
        System.out.println("cannot add a file to a file, you need to build a folder");
    }

    @Override
    public void delete(AbstractFileComponent componenet) {
        System.out.println("cannot delete other files or folders at this file");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
