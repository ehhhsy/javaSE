package Demo55;

public class Demo04impl {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        //设置名字的第一种方法
        demo04.setName("小强");
        demo04.start();

        //开启多线程
        Demo04 demo04thread = new Demo04("光头");
        String s = demo04thread.getName();
        System.out.println(s);
    }
}
