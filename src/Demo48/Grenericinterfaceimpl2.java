package Demo48;
/*
含有泛型的接口，第二种使用方式：接口使用什么泛型，实现类就是用什么泛型，类跟着接口走
就相当于定于了一个含有泛型的类，创建对象的时候确定泛型的类型
 */
public class Grenericinterfaceimpl2<E> implements Grenericinterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
