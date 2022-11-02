package Demo30;
/*
在任何版本的java中，接口都能定义抽象方法.
 格式：
 public abstract 返回值类型 方法名称（参数列表）;

 注意事项：
 1.接口当中的抽象方法，【必须是】两个固定的关键字：public abstaract
 2.这两个关键字修饰符，可以选择性地省略。可以省略一部分
 3.方法的三要素可以随意定义
 */
public interface Myabstract {
    public abstract void say();   //抽象方法
//    default abstract void say();   //错误的写法，【必须是】两个固定的关键字：

     abstract void say1(); //也是抽象方法 可以省略一部分
    public void say2(); //也是抽象方法   可以省略一部分
      void say3(); //也是抽象方法          可以全部省略

}
