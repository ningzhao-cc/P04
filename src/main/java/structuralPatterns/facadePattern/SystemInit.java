package structuralPatterns.facadePattern;

/**
 * Created by Ning on 5/4/18.
 */
public class SystemInit {
    private static SystemInit instance = new SystemInit();

    private SystemInit() {}

    public static SystemInit getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("The whole System is on");
        MusicSystem.getInstance().on();
        NaviSystem.getInstance().on();
        TempSystem.getInstance().on();
    }

    public void off() {
        System.out.println("THe whole System is off");
        MusicSystem.getInstance().off();
        NaviSystem.getInstance().off();
        TempSystem.getInstance().off();
    }

}
