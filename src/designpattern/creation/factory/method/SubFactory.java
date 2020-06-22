package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;
import designpattern.creation.factory.simple.OperationSub;

public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}