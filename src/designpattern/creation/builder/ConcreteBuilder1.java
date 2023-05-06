package designpattern.creation.builder;

/**
 * 具体建造者类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }

}
