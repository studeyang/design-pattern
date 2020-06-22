package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;
import designpattern.creation.factory.simple.OperationAdd;

public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}