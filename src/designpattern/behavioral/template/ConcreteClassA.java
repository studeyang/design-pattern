package designpattern.behavioral.template;

/**
 * 具体类A
 *
 * @author yangll
 */
public class ConcreteClassA extends AbstractTemplate {

    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A的方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A的方法2实现");
    }

}
