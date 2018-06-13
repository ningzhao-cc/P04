package structuralPatterns.flyweightPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ning on 6/13/18.
 */
public class FlyweightFactory {

    //// 11
    //private Map<Integer, Flyweight> pool = new HashMap<Integer, Flyweight>();
    //
    //private static FlyweightFactory instance = new FlyweightFactory();
    //
    //private FlyweightFactory() {
    //
    //}
    //
    //public static FlyweightFactory getInstance() {
    //    return instance;
    //}
    //
    //public Flyweight createFlyweight(Integer state) {
    //    // search for instance in Map first
    //    Flyweight fly = pool.get(state);
    //
    //    if (fly == null) {
    //        fly = new ConcreteFlyweight(state);
    //        pool.put(state, fly);
    //    }
    //    return fly;
    //}
    //// 11

    // 22
    private Map<Integer, Flyweight> pool = new HashMap<Integer, Flyweight>();

    private static FlyweightFactory instance = new FlyweightFactory();

    private FlyweightFactory() {}

    public static FlyweightFactory getInstance() {
        return instance;
    }

    /**
     * composite flyweight factory
     */
    public Flyweight createFlyweight(List<Integer> compsiteState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for (Integer i : compsiteState) {
            compositeFly.add(i, this.createFlyweight(i));
        }
        return compositeFly;
    }

    /**
     * pure flyweight factory
     */
    public Flyweight createFlyweight(Integer state) {
        Flyweight fly = pool.get(state);
        if (fly == null) {
            fly = new ConcreteFlyweight(state);
            pool.put(state, fly);
        }
        return fly;
    }
    // 22
}
