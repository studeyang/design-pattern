package designpattern.creation.factory.simple;

/**
 * 操作类工厂类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class OperationFactory {
    public static Operation createOperation(char operator) {
        Operation operation;

        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("unsupported operation");
        }

        return operation;
    }
}
