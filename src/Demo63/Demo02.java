package Demo63;
/*
//        incokeCook(()->{});   格式    【重点】
    lambda表达式的标准格式：
        有三部分组成：
            a。一些参数
            b。-一个箭头
            c。一段代码
         格式：
            （）：（参数列表）->{一些重写方法的代码}
             ->:  传递的意思，把参数传递给方法体{}
             {}：  重写接口的抽象方法的方法体
 */
public class Demo02 {
    public static void main(String[] args) {
//        使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "多线程任务==");
            }
        }).start();

//        使用lambda表达式，实现多线程
        new Thread(()-> {       //免去重写了run()方法
            System.out.println(Thread.currentThread().getName() + "多线程任务==");
        }
            ).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"多线程2022===");
        }).start();
    }

}
