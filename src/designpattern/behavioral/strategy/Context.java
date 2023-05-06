package designpattern.behavioral.strategy;

/**
 * 上下文
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }

}
