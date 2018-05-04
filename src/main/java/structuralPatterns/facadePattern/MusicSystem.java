package structuralPatterns.facadePattern;

/**
 * Created by Ning on 5/4/18.
 */
public class MusicSystem {
    private static MusicSystem instance = new MusicSystem();

    private MusicSystem() {}

    public static MusicSystem getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("MusicSystem is on");
    }

    public void off() {
        System.out.println("MusicSystem is off");
    }
}
