package designpattern.creation.factory.simple;

/**
 * 乘法类
 *
 * @author yangll
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
        return numberA * numberB;
    }

}
