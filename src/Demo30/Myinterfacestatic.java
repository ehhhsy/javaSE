package Demo30;
/*
  注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
  正确用法；通过接口名称，直接调用其中的静态方法。

  格式：
  接口名称.静态方法名（参数）;
 */
public class Myinterfacestatic implements MyinterfaaceStatic {
    public static void main(String[] args) {
        //调用静态方法
          MyinterfaaceStatic.methodStatic();

//        MyinterfaaceStatic one =new Myinterfacestatic(); new对象没必要
//        不能通过接口实现类的对象来调用接口当中的静态方法
//        one.methodStatic();
    }

  }
