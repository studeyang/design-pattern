package designpattern.structural.proxy;

/**
 * 真实实体类
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 *
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
	System.out.println("真实对象的请求");
    }

}
