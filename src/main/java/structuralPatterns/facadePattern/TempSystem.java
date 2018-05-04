package structuralPatterns.facadePattern;

/**
 * Created by Ning on 5/4/18.
 */
public class TempSystem {
    private static TempSystem instance = new TempSystem();

    private TempSystem() {}

    public static TempSystem getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TempSystem is on");
    }

    public void off() {
        System.out.println("TempSystem is off");
    }
}
