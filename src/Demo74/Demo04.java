package Demo74;

/**
 * 	使用函数式接口作为参数
 */
public class Demo04 {
    public static void main(String[] args) {
        //使用匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"---> 启动了");
            }
        });

        //使用lambda表达式,run没有参数
        startThread(()-> System.out.println(Thread.currentThread().getName()+"---> 启动了"));
    }

    private static void startThread(Runnable runnable) {
        new Thread(runnable).start();

    }
}
