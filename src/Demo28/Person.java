package Demo28;
/*
静态代码块的格式
  public class 类名称{     在类里写
       static{
        //静态代码块的内容
       }
  }
  特点：当第一次用到本类时，静态代码块会执行唯一的一次
 */
public class Person {
    static{
        System.out.println("静态代码块行");
    }

    public Person(){
        System.out.println("构造方法执行");
    }
}
