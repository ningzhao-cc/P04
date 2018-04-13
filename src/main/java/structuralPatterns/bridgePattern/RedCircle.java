package structuralPatterns.bridgePattern;

/**
 * Created by Ning on 4/11/18.
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle-> color : red, radius : " + radius + " at x = " + x + " y = " + y);
    }
}
