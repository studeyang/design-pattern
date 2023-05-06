package designpattern.behavioral.iterator;

/**
 * 迭代器接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 *
 * @param <T>
 */
public interface Iterator<T> {

    public T first();

    public T next();

    public boolean isDone();

    public T currentItem();

}
