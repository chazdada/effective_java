package relu01;

/**
 * @program: effective_java
 * @description:
 * @author: chazdada
 * @create: 2020-07-02 17:28
 **/
public class UserProvideImpl implements UserProvider{
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    static {
        ServiceManager.registerProvider("登录注册",new UserProvideImpl());
    }
}
