package designpattern.creation.factory.abstraction;

import designpattern.creation.factory.simple.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 利用反射改造简单工厂模式，去掉分支判断的逻辑
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class OperationFactory {
    private static Map<String, Class<?>> allOperationMaps = new HashMap<>();

    static {
        allOperationMaps.put("+", OperationAdd.class);
        allOperationMaps.put("-", OperationSub.class);
        allOperationMaps.put("*", OperationMul.class);
        allOperationMaps.put("/", OperationDiv.class);
    }

    public static Operation createOperation(String operator) throws InstantiationException, IllegalAccessException {
        Operation operation;

        Class<?> operationClass = allOperationMaps.get(operator);

        if (operationClass == null) {
            throw new RuntimeException("unsupported operation");
        }

        operation = (Operation) operationClass.newInstance();

        return operation;
    }

}
