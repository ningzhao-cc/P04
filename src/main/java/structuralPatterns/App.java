package structuralPatterns;

import structuralPatterns.adapterPattern.*;
import structuralPatterns.bridgePattern.ColorMaterialShapeImplementor;
import structuralPatterns.bridgePattern.ColorShapeImplementor;
import structuralPatterns.bridgePattern.ShapeImplementor;
import structuralPatterns.colors.Color;
import structuralPatterns.colors.ColorType;
import structuralPatterns.colors.RedColor;
import structuralPatterns.foods.EatclubFood;
import structuralPatterns.foods.EatclubNoodle;
import structuralPatterns.foods.Food;
import structuralPatterns.foods.Noodle;
import structuralPatterns.shapes.*;

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
        ////Client client = new Client(food);
        //Client client = new Client();
        ////client.setFood(food);
        //client.setFood(eatclubFood);
        //client.eatFood();

        //// Object Adapter
        //EatclubFood eatclubFood = new EatclubNoodle();
        //Client client = new Client();
        ////Adapter adapter = new Adapter(eatclubFood); // adaptor needs to implement Target interface and composite Adaptee interface
        ////client.setFood(adapter);
        ////Food food = new Adapter(eatclubFood);
        //EatclubFood food = new Adapter(eatclubFood);
        //client.setFood(food);
        //client.eatFood();

        // // Class Adapter
        //Food food = new Adapter2();
        //EatclubNoodle eatclubNoodle = new Adapter2();
        //
        //Client client = new Client(food);
        //client.eatFood();

        // // Class Adapter
        //Adapter2 adapter2 = new Adapter2();
        //Client client = new Client(adapter2);
        //client.eatFood();

        // // Class Adapter
        //Adapter3 adapter3 = new Adapter3();
        //Client client = new Client(adapter3);
        //Client client = new Client();
        //Food food = new Adapter3();
        //EatclubFood eatclubFood = new Adapter3();
        //client.setFood(food);
        //client.eatFood();


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
        ////
        //System.out.println("***********");
        //
        //b[1] = 2;
        //
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
        //
        //System.out.println("***********");
        //
        //map.put(b, 3);
        //
        //System.out.println(map.get(a));
        //System.out.println(map.get(b));
        //
        //
        //
        //HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        //String s1 = new String("1");
        //String s2 = new String("2");
        //System.out.println(Integer.toHexString(s1.hashCode()));
        //System.out.println(Integer.toHexString(s2.hashCode()));
        ////map1.put(s1, 1);
        ////map1.put(s2, 2);
        //
        ////System.out.println(map1.get(s1));
        ////System.out.println(map1.get(s2));
        //
        //s2 = "1";
        //
        ////System.out.println(map1.get(s1));
        ////System.out.println(map1.get(s2));
        //System.out.println(s1 == s2);
        //
        //System.out.println(Integer.toHexString(s1.hashCode()));
        //System.out.println(Integer.toHexString(s2.hashCode()));
        //
        //System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        //System.out.println(Integer.toHexString(System.identityHashCode(s2)));


        // // Bridge pattern
        //
        //Shape rectangle = new Rectangle(new ColorShapeImplementor());
        //rectangle.setParam(new int[]{5, 6});
        //rectangle.print();

        //
        //ColorShape blueRectangle = new BlueRectangle(new ColorShapeImplementor());
        //blueRectangle.setParam(new int[]{6, 7});
        //blueRectangle.print();

        //
        //ColorShape redCircle = new RedCircle(new ColorShapeImplementor());
        //redCircle.setParam(new int[]{6});
        //redCircle.print();
        //
        //Color redColor = new RedColor((new ColorShapeImplementor()));
        //redColor.print();

        ColorMaterialShape bluePlasticTriangle = new BluePlasticTriangle(new ColorMaterialShapeImplementor());
        bluePlasticTriangle.setParam(new int[]{3, 4, 5});
        bluePlasticTriangle.print();
    }
}
