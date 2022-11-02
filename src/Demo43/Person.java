package Demo43;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


    /*
    直接打印对象的地址值没有意义，需要重写object方法
    打印对象的属性（name，age0
     */

    //【重点】
    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';   //返回的是什么，打印的就是什么
    }

//object类的equals方法默认比较的是两个对象的地址值,没有意义
//    所以我们需要重写equals方法，比较两个对象的属性（name,age）
//    对象的属性一样,返回true，否则返回false
//    问题:
//     隐含一个多态
//    object object=p2=new Person(..);
//      多态的弊端：无法使用子类特有的内容（属性，方法）
//    解决：可以使用向下转型（强转）把object类型转化成Person
//    @Override
//    public boolean equals(Object o) {
//        //使用向下转型（强转）把object类型转化成Person
//        Person p1=(Person)o;
//        //比较两个对象的属性，一个调用方法的this（p1），一个就是p2
//        boolean b = this.name.equals(p1.name) && this.age == p1.age;
//        return b;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        //getClass() != o.getClass()使用反射技术，判断o是不是Person
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        return name != null ? name.equals(person.name) : person.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
