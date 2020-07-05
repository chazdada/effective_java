package relu02;

/**
 * @program: effective_java
 * @description: 当构造器参数量很大，而且不确定时，如何设计并创建类
 * 1. 重载构造器方法，为每一种参数组合实现一个构造器
 * 2. javabean 方式，先创建类，然后使用 setter 方法注入 弊端：无法创建不可变类，并发问题
 * 3. 建造者模式
 *
 * @author: chazdada
 * @create: 2020-07-05 11:02
 **/
public class BuilderPattern {
}
