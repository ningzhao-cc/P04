package structuralPatterns.foods;

/**
 * Created by Ning on 3/27/18.
 */
public class Salad implements Food {
    public void eatFood() {
        eatSalad();
    }

    public void eatSalad() {
        System.out.println("To eat salad: ");
        System.out.println("eat it in fresh");
    }
}
