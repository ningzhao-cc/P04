package structuralPatterns.adapterPattern;

/**
 * Created by Ning on 4/2/18.
 */
public class Adapter2 extends EatclubNoodle implements Food{

    public Adapter2() {}

    public void eatFood() {
        eatEatclubFood();
    }

    public void eatEatclubFood() {
        System.out.println("using eatclub chopsticks to eat EatclubNoodle");
    }

}
