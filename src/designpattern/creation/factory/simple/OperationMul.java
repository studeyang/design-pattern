package designpattern.creation.factory.simple;

/**
 * 乘法类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
        return numberA * numberB;
    }

}
