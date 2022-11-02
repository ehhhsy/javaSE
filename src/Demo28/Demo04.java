package Demo28;
/*
静态代码块的格式
  public class 类名称{     在类里写---Person
       static{
        //静态代码块的内容
       }
  }
  特点：当第一次用到本类时，静态代码块会执行唯一的一次
  【静态方法总是优先于非静态】，所有静态代码块比构造方法先执行

  典型用途：
  用来一次性地对静态成员变量进行赋值，学习JDBC有特殊用途
 */
public class Demo04 {
    public static void main(String[] args) {
        //静态方法总是优先于非静态

         Person one =new Person(); //new一个，一个构造方法
         Person two =new Person(); //new一个，一个构造方法

//         输入结果为
        //静态代码块行
        //构造方法块行
        //构造方法块行
    }
}
