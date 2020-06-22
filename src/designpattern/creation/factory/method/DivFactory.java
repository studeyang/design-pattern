package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;
import designpattern.creation.factory.simple.OperationDiv;

public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}