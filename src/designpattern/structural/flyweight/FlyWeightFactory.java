package designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        if (!flyWeights.containsKey(key)) {
            flyWeights.put(key, new ConcreteFlyWeight());
        }

        return flyWeights.get(key);
    }

}
