package relu01;

/**
 * @program: effective_java
 * @description:
 * @author: chazdada
 * @create: 2020-07-02 16:49
 **/
public class Person {
    private String name;
    private int age;
    private Sex sex;

    private Person(String name,int age,Sex sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static Person getMan(String name,int age){
        return new Person(name,age,Sex.MAN);
    }

    public static Person getWoman(String name,int age){
        return new Person(name,age,Sex.WOMAN);
    }


    public static void main(String[] args) {
        Person p = Person.getMan("jack",12);
        boolean a = true;
        Boolean.valueOf(a);
    }
}

enum Sex{
    MAN,WOMAN
}

