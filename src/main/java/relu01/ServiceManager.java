package relu01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: effective_java
 * @description:
 * @author: chazdada
 * @create: 2020-07-02 17:29
 **/
public class ServiceManager {

    private ServiceManager(){

    }

    private static final Map<String,UserProvider> providers=new ConcurrentHashMap<String,UserProvider>();

    public static void  registerProvider(String name,UserProvider provider){

        providers.put(name, provider);

    }

    public static UserService getService(String name){
        UserProvider provider=providers.get(name);
        if(provider==null){
            throw new IllegalArgumentException("No provider registered with name="+name);

        }
        return provider.getUserService();
    }

}
