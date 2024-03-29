package designpattern.behavioral.strategy;

/**
 * 策略接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public interface Strategy {
    void algorithmInterface();
}

class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略A的具体算法实现");
    }

}

class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略B的具体算法实现");
    }

}

class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略C的具体算法实现");
    }

}
