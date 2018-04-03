package structuralPatterns;

import structuralPatterns.adapterPattern.*;
import structuralPatterns.foods.EatclubFood;
import structuralPatterns.foods.EatclubNoodle;
import structuralPatterns.foods.Food;
import structuralPatterns.foods.Noodle;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Adapter Pattern
        // // general use
        //Food food = new Noodle();
        //EatclubFood eatclubFood = new EatclubNoodle();
        //Client client = new Client(food);
        //client.eatFood();

        //// Object Adapter
        //EatclubFood eatclubFood = new EatclubNoodle();
        //Client client = new Client();
        //Adapter adapter = new Adapter(eatclubFood); // adaptor needs to implement Target interface and composite Adaptee interface
        //client.setFood(adapter);
        //client.eatFood();

        // // Class Adapter
        //Food food = new Adapter2();
        //
        //Client client = new Client(food);
        //client.eatFood();

        // // Class Adapter
        //Adapter2 adapter2 = new Adapter2();
        //Client client = new Client(adapter2);
        //client.eatFood();

        // // Class Adapter
        Adapter3 adapter3 = new Adapter3();
        Client client = new Client(adapter3);
        client.eatFood();

        //HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //Integer a = new Integer(1);
        //Integer b = new Integer(1);
        //map.put(a, 1);
        //map.put(b, 2);
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));

        //HashMap<int[], Integer> map = new HashMap<int[], Integer>();
        //int[] a = {1, 2};
        //int[] b = {1, 3};
        //map.put(a, 1);
        //map.put(b, 2);
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
        //
        //System.out.println("***********");
        //
        //b[1] = 2;
        //
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
        //
        //System.out.println("***********");
        //
        //map.put(b, 2);
        //
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
    }
}
