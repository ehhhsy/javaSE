package Demo48;
/*
测试含有泛型的接口
 */
public class Demo04 {
    public static void main(String[] args) {
        Grenericinterfaceimpl1 grenericinterfaceimpl = new Grenericinterfaceimpl1();
        grenericinterfaceimpl.method("aaaa");

        Grenericinterfaceimpl2<Integer> intimpl2 = new Grenericinterfaceimpl2<>();
        intimpl2.method(11);

        Grenericinterfaceimpl2<String> stringimpl2 = new Grenericinterfaceimpl2<>();
        stringimpl2.method("阿三打撒");
    }
}
