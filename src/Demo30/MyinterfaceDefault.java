package Demo30;
/*
   从java8开始，接口允许定义默认方法。
   格式：
   public default 返回值类型 方法名称（参数列表）{
   }

   备注：接口当中的默认方法，可以解决接口升级的问题
   hsy:有些方法已经投入使用，往里添加方法的话，又要重写添加的方法
   新添加的方法，改成默认方法就能解决问题
 */
public interface MyinterfaceDefault {

    //抽象方法
    public abstract void method();
    //抽象方法
    public abstract   void methodAbs();
    //新添加了一个抽象方法
//    public abstract   void methodBB();

    //新添加的方法，改成默认方法就能解决问题
    public default void methoddefault(){
        System.out.println("这新加添的默认方法");
    }
}
