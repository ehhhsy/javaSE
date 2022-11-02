package Demo35;

/*
fianl可以用来修饰一个成员变量

对于一个成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变

1.由于是成员变量具有默认值，所以【用了final关键字之后必须手动赋值】，不在给默认值了

2.对于final的成员变量，要么【直接赋值】，要么【通过构造方法赋值】.2选1

3.必须保证类当中所有重载的构造方法，都会对final的成员变量进行赋值
 set方法就用不了，

 */
public class Person {
    //    private final String name;  报错，因为没有赋值              11111111111111111
    private final String name;

    public Person(String name) {
        this.name = name;   //这里的构造方法就报错，因为你用了直接赋值
    }

    public Person() {
        name = "飞机哥";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//===================================================================


//    private final String name="乌鸦哥";           22222222222222222222222
//
//
//    public Person() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//

}
