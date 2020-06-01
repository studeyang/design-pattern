package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.*;

/**
 * 工厂接口
 *
 * @author yangll
 */
public interface IFactory {
    public Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

}
