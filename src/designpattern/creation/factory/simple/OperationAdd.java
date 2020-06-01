package designpattern.creation.factory.simple;

/**
 * 加法类
 *
 * @author yangll
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
        return numberA + numberB;
    }

}
