package relu03;

/**
 * @program: effective_java
 * @description: 枚举类型创建单例模式
 * @author: chazdada
 * @create: 2020-07-07 20:00
 **/
public class Singleton {
    private Singleton(){
        
    }
    
    enum S{
        INSTANCE;
        private Singleton singleton;
        S(){
            singleton = new Singleton();
        }
    }
    public static Singleton getInstance(){
        return S.INSTANCE.singleton;
    }
    
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
    
}
