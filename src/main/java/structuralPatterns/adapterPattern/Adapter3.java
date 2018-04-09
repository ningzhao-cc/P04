package structuralPatterns.adapterPattern;

import structuralPatterns.foods.EatclubFood;
import structuralPatterns.foods.Food;

/**
 * Created by Ning on 4/3/18.
 */
public class Adapter3 implements Food, EatclubFood{
    public void eatEatclubFood() {
        // for eatclub noodle
        // for eatclub salad
    }

    public void eatFood() {
        System.out.println("I do not eat food");
    }
}
