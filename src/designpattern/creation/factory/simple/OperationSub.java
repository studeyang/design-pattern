package designpattern.creation.factory.simple;

/**
 * 减法类
 *
 * @author yangll
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
        return numberA - numberB;
    }

}
