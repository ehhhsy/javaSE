package Demo08;
//https://www.bilibili.com/video/BV1pJ411y7UK?p=3    �������_demo1
public class test {
    int a;
    int b;
    public void say(){          //��Ҫstatic����������
        System.out.println("hello");
    }

    public static void main(String[] args) {
        test t = new test();
        t.b=10;
        t.a=20;
        System.out.println(t.b);
        System.out.println(t.a);
        t.say();
    }
}
