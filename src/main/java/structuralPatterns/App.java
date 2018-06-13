package structuralPatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structuralPatterns.adapterPattern.*;
import structuralPatterns.bridgePattern.*;

import structuralPatterns.compositePattern.AbstractFileComponent;
import structuralPatterns.compositePattern.File;
import structuralPatterns.compositePattern.Folder;
import structuralPatterns.decoratorPattern.ColorDecorator;
import structuralPatterns.decoratorPattern.FrameDecorator;
import structuralPatterns.decoratorPattern.Paint;
import structuralPatterns.facadePattern.SystemInit;
import structuralPatterns.flyweightPattern.ConcreteFlyweight;
import structuralPatterns.flyweightPattern.Flyweight;
import structuralPatterns.flyweightPattern.FlyweightFactory;
import structuralPatterns.foods.EatclubFood;
import structuralPatterns.foods.EatclubNoodle;
import structuralPatterns.foods.Food;
import structuralPatterns.foods.Noodle;
import structuralPatterns.proxyPattern.DevOps;
import structuralPatterns.proxyPattern.Engineer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static private final Logger logger = LoggerFactory.getLogger(App.class);
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
        // 11
        //Shape[] shapes = new Shape[2];
        //shapes[0] = new Circle(new DrawCircleImplementor(1,2,3));
        //shapes[1] = new Circle(new DrawRedCircleImplementor(2,3,4));
        //for (Shape shape : shapes) {
        //    shape.draw();
        //}


        // 22
        //Shape[] shapes = new Shape[2];
        //shapes[0] = new Circle(1,2,3, new DrawCircleImplementor());
        //shapes[1] = new Circle(2, 3, 4, new DrawRedCircleImplementor());
        //for (Shape shape : shapes) {
        //    shape.resize(4);
        //    shape.draw();
        //}



        // decorator Pattern
        // new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream( "io.txt" )));

        //Paint paint = new Paint();
        //System.out.println(paint.draw());
        //
        //FrameDecorator frameDecorator = new FrameDecorator(paint);
        //System.out.println(frameDecorator.draw());
        //
        //ColorDecorator colorDecorator = new ColorDecorator(paint);
        //System.out.println(colorDecorator.draw());
        //
        //ColorDecorator colorDecorator1 = new ColorDecorator(frameDecorator);
        //System.out.println(colorDecorator1.draw());

        // Facade Pattern
        //
        //SystemInit.getInstance().on();
        //
        //SystemInit.getInstance().off();


        // Proxy pattern
        // 11
        //Engineer engineer = new DevOps();
        //engineer.build();


        // 22
        //Engineer engineer = DevOps.getInstance();
        //engineer.build();


        // Composite pattern
        //Folder folder0 = new Folder("folder 0");
        //File file0_123 = new File("file 0_123");
        //Folder folder0_1 = new Folder("folder 0 _ 1");
        //File file0_1_123 = new File("file 0_1_123");
        //
        //folder0.add(file0_123);
        //folder0_1.add(folder0_1);
        //folder0_1.add(file0_1_123);
        //
        //folder0.print(0);


        // Flyweight pattern
        //String s1 = "abcd";
        //String s2 = "abcd";
        //String s3 = "ab" + "cd";
        //String s4 = "ab";
        //s4 += "cd";
        //System.out.println(s1 == s2);
        //System.out.println(s1 == s3);
        //System.out.println(s1 == s4);
        //// how to get the address of the string?
        //s4 = "abcd";
        //System.out.println(s1 == s4);

        // 11
        //FlyweightFactory factory = FlyweightFactory.getInstance();
        //Flyweight fly = factory.createFlyweight(new Integer(1));
        //fly.operation("First call");
        //System.out.println(fly.hashCode());
        //
        //fly = factory.createFlyweight(new Integer(2));
        //fly.operation("Second call");
        //System.out.println(fly.hashCode());
        //
        ////System.gc();
        //
        //fly = factory.createFlyweight(new Integer(1));
        //fly.operation("Third call");
        //System.out.println(fly.hashCode());
        // 11


        // 22

        List<Integer> compositeStates = Arrays.asList(1,2,3,1,2);

        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight compositeFly1 = factory.createFlyweight(compositeStates);
        Flyweight compositeFly2 = factory.createFlyweight(compositeStates);

        compositeFly1.operation("Composite call");

        System.out.println(compositeFly1 == compositeFly2);

        Integer state = 1;
        Flyweight fly1 = factory.createFlyweight(state);
        Flyweight fly2 = factory.createFlyweight(state);

        System.out.println(fly1 == fly2);

    }
}
