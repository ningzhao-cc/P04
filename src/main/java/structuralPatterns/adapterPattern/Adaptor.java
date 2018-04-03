package structuralPatterns.adapterPattern;

/**
 * Created by Ning on 3/27/18.
 */
public class Adaptor implements Food {
    private EatclubFood eatclubFood;

    public Adaptor(EatclubFood eatclubFood) {
        this.eatclubFood = eatclubFood;
    }

    public void eatFood() {
        eatclubFood.eatEatclubFood();
    }
}
