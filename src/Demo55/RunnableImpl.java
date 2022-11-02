package Demo55;
/*
    创建一个Runnable接口的实现类
 */
public class RunnableImpl implements Runnable  {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            //获取名字
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
