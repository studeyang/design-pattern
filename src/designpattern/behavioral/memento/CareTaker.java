package designpattern.behavioral.memento;

/**
 * 管理者（CareTaker）类：管理备忘录
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
