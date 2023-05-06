package designpattern.creation.factory.abstraction;

import designpattern.creation.factory.simple.Operation;

/**
 * 客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Operation operation = OperationFactory.createOperation("/");

        operation.numberA = 7;
        operation.numberB = 8;

        System.out.println(operation.getResult());
    }
}
