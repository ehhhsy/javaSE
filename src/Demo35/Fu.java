package Demo35;
/*
当final关键字用来【修饰一个方法】的时候，这个方法就是最终方法，也就是【不能被覆盖重写】。

   格式：
   修饰符 final 返回值类型 方法名称（参数列表）{
   方法体
   }

   对于事项：
   对于类，方法来说，abstract关键字和fianl关键字【不能同时使用】，因为矛盾
   hsy:abstract是没有方法体，一定要覆盖重写，而final是不能有子类，不能覆盖重写/
 */
public class Fu {


    public final void method(){
        System.out.println("父类方法执行");
    }
}
