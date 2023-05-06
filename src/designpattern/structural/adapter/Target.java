package designpattern.structural.adapter;

/**
 * 客户所期待的接口
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public abstract class Target {
    public void request() {
        System.out.println("普通请求！");
    }
}
