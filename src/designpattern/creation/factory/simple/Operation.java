package designpattern.creation.factory.simple;

/**
 * 操作类抽象类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public abstract class Operation {
    public double numberA;
    public double numberB;

    public abstract double getResult();
}
