package designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 *
 * @author yangll
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
