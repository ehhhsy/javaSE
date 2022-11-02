package Demo30;

public interface Demo06interfaceA {
    //错误写法！ 接口不能有静态代码块
//     static{


//错误写法！接口不能有构造方法
//     public Myinterface {
//     }
    public  abstract  void methodA();

    public  abstract  void methodAbs();

    public default void methoddefault(){
        System.out.println("默认方法AAA");
    }
}
