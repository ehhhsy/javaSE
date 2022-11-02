package Demo30;

public class Demo02 implements Myabstract  {
    @Override
    public void say() {
        System.out.println("奥里给i");
    }

    @Override
    public void say2() {

    }

    @Override
    public void say3() {

    }

    @Override
    public void say1() {

    }

    public static void main(String[] args) {
        //错误写法   不能直接new接口对象
//        Myabstract inter =new Demo20.Myabstract();

        //真确写法
        Demo02 one =new Demo02();
        one.say();  //调用方法
    }
}
