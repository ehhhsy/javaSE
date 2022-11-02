package Demo48;
/* demo03
定义含有泛型的方法:定义在方法的修饰符和返回值类型之间

格式：
    修饰符 <E> 返回值类型 方法名（参数列表（使用泛型））{
      //方法体；
    }
    含有泛型的方法，在调用方法的时候确定了泛型的数据类型
    传递什么类型的参数，泛型就是什么类型
 */
public class GenericMethod {


    public <E>void method(E e) {  //例子
        System.out.println(e);
    }

    public static <S> void methodStatic(S s){  //字母随意
        System.out.println("静态方法  "+s);
    }
}
