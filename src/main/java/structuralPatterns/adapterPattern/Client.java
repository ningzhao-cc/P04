package structuralPatterns.adapterPattern;

import structuralPatterns.foods.Food;

/**
 * Created by Ning on 3/27/18.
 */
public class Client {
    // using an adaptor to help eat all kinds of food.

    private Food food;

    public Client() {}

    public Client(Food food) {
        this.food = food;
    }

    public void eatFood() {
        if (food == null) {
            System.out.println("oops, no food to eat");
        }
        else {
            food.eatFood();
        }
    }

    public void setFood(Food food) {
        this.food = food;
    }

}
