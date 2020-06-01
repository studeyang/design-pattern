package designpattern.behavioral.iterator;

/**
 * 聚集接口
 *
 * @author yangll
 *
 * @param <T>
 */
public interface Aggregate<T> {

    public Iterator<T> createIterator();
}
