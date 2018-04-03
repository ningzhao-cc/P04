package structuralPatterns.adapterPattern;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

/**
 * Created by Ning on 3/27/18.
 */
public class Noodle implements Food{
    public void eatFood() {
        eatNoodle();
    }
    public void eatNoodle() {
        System.out.println("To eat noodle: ");
        System.out.println("Boil some water,\nAdd boiling water then wait,\nNow can eat it");
    }
}
