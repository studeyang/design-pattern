package designpattern.creation.singleton;

/**
 * 线程安全的写法，单例模式最优写法
 *
 * @author yangll
 */
public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() {

    }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }

        return instance;
    }

}
