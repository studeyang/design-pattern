package designpattern.creation.factory.method;

import designpattern.creation.factory.simple.Operation;

/**
 * 工厂接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public interface IFactory {
    Operation createOperation();
}