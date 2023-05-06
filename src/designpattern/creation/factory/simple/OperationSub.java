package designpattern.creation.factory.simple;

/**
 * 减法类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
        return numberA - numberB;
    }

}
