package designpattern.structural.adapter;

/**
 * 客户所期待的接口
 *
 * @author yangll
 */
public abstract class Target {
    public void request() {
        System.out.println("普通请求！");
    }
}
