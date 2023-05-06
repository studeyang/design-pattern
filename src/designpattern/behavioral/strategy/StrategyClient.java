package designpattern.behavioral.strategy;

/**
 * 客户端使用策略
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

    }
}
