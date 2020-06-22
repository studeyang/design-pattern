package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;

/**
 * 工厂接口
 *
 * @author yangll
 */
public interface IFactory {
    Operation createOperation();
}