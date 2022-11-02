package demo01;

//定义方法的三要数
//需不需参数？
//练习，定义一个方法求出1-100的和值2020.6.8   2020.9.13
public class FANGfa {
    public static void main(String[] args) {
        sum(); //单独调用
        printNIHAO(3);
        zzz();   //新写法continue
        System.out.println("===============");


        int h = 1;
        while (h < 3) {                                 //while 练习
            System.out.println("while" + h);
            h++;
        }
        int s = 6;                                    //do-while 不熟练
        do {
            System.out.println("do-whlie一定要执行一次" + s);
            s++;
        }
        while (s < 10);
        int y = 1; //初始化语句
        do {
            System.out.println("do====while 练习2  " + y);  //循环体
            ++y;
        }
        while (y < 3);

        int n = 8;
        do {
            System.out.println("do-while 练习3  " + (7 + n));   //不加括号的话,就会变成do-while 练习3  78，因为字符串加int都会变成字符串
            ++n;
        } while (n < 10);

        System.out.println("====================");
        Demo01();
        Demo02(50);
        System.out.println(Demo03(50,100));
        
    }

    private static int Demo03(int a,int b) {
        for (int i = 1; i <= b; i++) {
                a+=i;
        }
        return a;
    }

    private static void Demo02(int a) {
        int n=0;
        for (int i = 1; i <= a; i++) {
            n+=i;
        }
        System.out.println(n);
    }

    private static void Demo01() {
        int n=0;
        for (int i = 1; i <= 100; i++) {
            n+=i;
        }
        System.out.println(n);
    }
    
    

    public static void sum() {
        int mmm = 0;
        for (int i = 1; i <= 100; i++) {
            mmm += i;
        }
        System.out.println(mmm);
    }

    //打印指定次数的你好

    /*public static int cs (int a) {

        for(int i =0;i<a;i++) {
            System.out.println("你好"+i);
        }
        return a;
       */
    public static void printNIHAO(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("你好" + i);
        }
    }

    public static void zzz() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  //奇数
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

}

