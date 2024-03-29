package designpattern.behavioral.state;

/**
 * Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }
}
