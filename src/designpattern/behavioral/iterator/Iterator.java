package designpattern.behavioral.iterator;

/**
 * 迭代器接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 *
 * @param <T>
 */
public interface Iterator<T> {

    T first();

    T next();

    boolean isDone();

    T currentItem();

}
