package designpattern.structural.flyweight;

/**
 * 客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class FlyWeightClient {

    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight fx = factory.getFlyWeight("X");
        fx.operation(--extrinsicState);

        FlyWeight fy = factory.getFlyWeight("Y");
        fy.operation(--extrinsicState);

        FlyWeight fz = factory.getFlyWeight("Z");
        fz.operation(--extrinsicState);

        FlyWeight uf = new UnsharedConcreteFlyWeight();
        uf.operation(--extrinsicState);
    }

}
