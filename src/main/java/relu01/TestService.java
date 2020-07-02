package relu01;

/**
 * @program: effective_java
 * @description:
 * @author: chazdada
 * @create: 2020-07-02 17:30
 **/
public class TestService {

    public static void main(String[] args) {
        try {
            Class.forName("relu01.UserProvideImpl");
            UserService userService=ServiceManager.getService("登录注册");
            userService.register();
            userService.login();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
