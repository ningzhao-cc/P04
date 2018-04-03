package structuralPatterns;

import structuralPatterns.adapterPattern.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // // general use
        //Food food = new Noodle();
        //EatclubFood eatclubFood = new EatclubNoodle();
        //Client client = new Client(food);
        //client.eatFood();

        // Object Adapter
        EatclubFood eatclubFood = new EatclubNoodle();
        Client client = new Client();
        Adapter adapter = new Adapter(eatclubFood); // adaptor needs to implement Target interface and composite Adaptee interface
        client.setFood(adapter);
        client.eatFood();

        // // Class Adapter
        //Food food = new Adapter2();
        //
        //Client client = new Client(food);
        //client.eatFood();
    }
}
