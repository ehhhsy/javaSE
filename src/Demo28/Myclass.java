package Demo28;

public class Myclass {
    int num;  //成员变量
    static int numstatic;  //静态变量

    //成员方法
    public  void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numstatic);   //成员方法可以访问静态变量
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numstatic);
        //静态不能直接反问非静态【重点】
//        System.out.println(num);   错误写法
    }
}
