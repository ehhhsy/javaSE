package Demo48;

import static Demo34.Demo.method;

/*
测试含有泛型的方法
 */
public class Demo03 {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
       genericMethod.method(1);

       //静态方法，通过类名.方法名（）直接使用
       GenericMethod.methodStatic("ABC");
    }
}
