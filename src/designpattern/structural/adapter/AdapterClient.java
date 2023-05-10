package designpattern.structural.adapter;

/**
 * 适配器客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class AdapterClient {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
