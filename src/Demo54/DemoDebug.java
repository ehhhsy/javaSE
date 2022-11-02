package Demo54;
/*
Debug调试程序：
     可以让代码逐行执行，查看代码的过程，调试程序中出现的bug
   使用方式：
     圆点，哪里有bug添加到哪里
     执行程序：
     右键调试【重点】
     f8逐行执行程序
     f7进入方法中
     shift+f8调出方法
 */
public class DemoDebug {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        int sum=a+b;
        System.out.println(sum);

        int c=0;
        for (int i = 0; i < 3; i++) {
          c++;
        }

        demo(3);
    }

    private static void demo(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("hallo");
        }
    }

}
