package Chapter5.SingletonPattern;

/**
 * Created by lenovo on 2017/8/28.
 */
public class SimpleSingleton {
    private static SimpleSingleton uniqueInstance;
    private SimpleSingleton() {};       //导致无法创建对象

    public static SimpleSingleton getInstance(){
        // 好处用到才创建
        if(uniqueInstance == null){
            uniqueInstance = new SimpleSingleton();
        }
        return uniqueInstance;
    }
}
