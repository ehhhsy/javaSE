package Demo35;
/*
1.final用来修饰一个类的时候，格式：
public final class 类名称{
}
含义：当前这个类不能有任何子类（太监类）,但是有父类

hsy；一个final类该怎么写，就怎么写，就是不能有子类

注意：一个类如果是final的，那么其中的所以成员方法都无法进行覆盖重写（因为没儿子）
 */

                          //隐藏的
public final class Myclass/* extends Object*/{
    public void method(){
        System.out.println("final用来修饰一个类");
    }

}
