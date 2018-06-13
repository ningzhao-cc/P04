package structuralPatterns.proxyPattern;

/**
 * Created by Ning on 5/5/18.
 */
public class DevOps implements Engineer {
    // // 22
    private static DevOps instance = new DevOps();
    private DevOps() {}
    public static DevOps getInstance() {
        return instance;
    }

    public void build() {

        Deployment.getInstance().build(instance);
        //ServerEngineer serverEngineer = new ServerEngineer();
        //Deployment.getInstance().build(serverEngineer);
        //serverEngineer.build();
    }

    // // 11
    //public void build() {
    //    ServerEngineer serverEngineer = new ServerEngineer();
    //    serverEngineer.build();
    //}

    public void request() {
        System.out.println("DevOps posts a request");
    }
}
