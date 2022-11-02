package Demo55;
/*
    设置线程的名称(了解)
      1.使用Thread类中的方法setName(名字)
        void setName改变线程的名称,是指于name相同
      2.创建一个带参数的构造方法,参数传递线程的名称,调用父类的构造方法,把线程名称传递给父类,让父类(thread)给子线程起个名字

 */
public class Demo04 extends Thread{
    public Demo04() {
    }

    public Demo04(String name) {
        super(name);//把线程名称传递给父类,让父类(thread)给子线程起个名字
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}



