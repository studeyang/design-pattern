package designpattern.creation.factory.simple;

/**
 * 操作类抽象类
 *
 * @author yangll
 */
public abstract class Operation {
    public double numberA;
    public double numberB;

    public abstract double result();
}
