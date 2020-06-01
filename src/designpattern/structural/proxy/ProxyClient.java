package designpattern.structural.proxy;

/**
 * 代理客户端
 *
 * @author yangll
 *
 */
public class ProxyClient {
    public static void main(String[] args) {
	Proxy proxy = new Proxy();
	proxy.request();
    }
}
