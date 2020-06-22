package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;
import designpattern.creation.factory.simple.OperationMul;

public class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}