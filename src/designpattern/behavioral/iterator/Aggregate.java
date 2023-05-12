package designpattern.behavioral.iterator;

/**
 * 聚集接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 *
 * @param <T>
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();
}
