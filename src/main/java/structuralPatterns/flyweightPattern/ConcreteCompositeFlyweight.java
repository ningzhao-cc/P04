package structuralPatterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ning on 6/13/18.
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<Integer, Flyweight> pool = new HashMap<Integer, Flyweight>();

    /**
     * add a new Flyweight to the pool
     */
    public void add(Integer key, Flyweight fly) {
        pool.put(key, fly);
    }


    public void operation(String state) {
        Flyweight fly = null;
        for (Integer i : pool.keySet()) {
            fly = pool.get(i);
            fly.operation(state);
        }
    }
}
