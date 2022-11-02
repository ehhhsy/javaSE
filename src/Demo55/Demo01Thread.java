package Demo55;
/*
    主线程：执行（main）方法的线程

    单线程程序：java程序中只有一个线程
    执行main方法开始，【从上到下依次执行】

 */
        //单线程程序
public class Demo01Thread {
    public static void main(String[] args) {
        Person p1 = new Person("王一");
        p1.yun();

        System.out.println(0/0);//这里有异常，应该用多线程，这样就不会影响后续代码的执行
        Person p2 = new Person("小刘");   //从上到下
        p2.yun();
    }
}
