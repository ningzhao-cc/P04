package structuralPatterns.facadePattern;

/**
 * Created by Ning on 5/4/18.
 */
public class NaviSystem {
    private static NaviSystem instance = new NaviSystem();

    private NaviSystem() {}

    public static NaviSystem getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("NaviSystem is on");
    }

    public void off() {
        System.out.println("NaviSystem is off");
    }
}
