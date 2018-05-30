package structuralPatterns.proxyPattern;

/**
 * Created by Ning on 5/5/18.
 */
public class Deployment {
    private static Deployment instance = new Deployment();
    private Deployment() {}
    public static Deployment getInstance() {
        return instance;
    }

    public void build(Engineer engineer) {
        if (engineer instanceof DevOps) {
            System.out.println("Building process starts");
        }
        else {
            System.out.println("Sorry, you cannot build it");
        }
    }
}
