package designpattern.creation.factory.simple;

/**
 * 加法类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }

}
