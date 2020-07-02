package relu01;

/**
 * @program: effective_java
 * @description: 静态工厂方法模式
 * 优势：
 * 1.相比于普通构造器，它有名称   Person类
 * 2.不必每次调用创建一个新的对象 Boolean valueOf
 * 3.返回原类型的子类对象
 * 4.返回对象的类可以动态变化
 * 5.返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在。 服务提供者框架 https://www.jianshu.com/p/72d1b41f7cde
 *
 * 缺点：
 * 1.类如果不含有共有的或受保护的构造器，就不能被子类化 :父类private构造器，子类无法继承
 * 2.很难发现对应api valueOf instance create
 *
 * @author: chazdada
 * @create: 2020-07-02 16:48
 **/
public class StaticFactoryMethod {
}



