package designpattern.structural.proxy;

/**
 * 代理客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class ProxyClient {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }

}
