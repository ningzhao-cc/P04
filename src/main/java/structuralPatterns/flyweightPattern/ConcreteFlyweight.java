package structuralPatterns.flyweightPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ning on 6/12/18.
 */
public class ConcreteFlyweight implements Flyweight {

    static private final Logger logger = LoggerFactory.getLogger(ConcreteFlyweight.class);
    private Integer intrinsicState = null;

    /**
     * Constructor, the intrinsic state passed in as param
     * @param state
     */
    public ConcreteFlyweight(Integer state) {
        this.intrinsicState = state;
    }

    /**
     * Method, the extrinsic state passed in as param,
     * without changing the intrinsic state.
     *
     * @param state
     */
    public void operation(String state) {
        System.out.println("Intrinsic state = " + getIntrinsicState());
        System.out.println("Extrinsic state = " + state);
    }

    public Integer getIntrinsicState() {
        return this.intrinsicState;
    }

}
