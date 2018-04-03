package structuralPatterns.adapterPattern;

import structuralPatterns.foods.EatclubFood;
import structuralPatterns.foods.Food;

/**
 * Created by Ning on 3/27/18.
 */
public class Adapter implements Food {
    private EatclubFood eatclubFood;

    public Adapter(EatclubFood eatclubFood) {
        this.eatclubFood = eatclubFood;
    }

    public void eatFood() {
        eatclubFood.eatEatclubFood();
    }
}
