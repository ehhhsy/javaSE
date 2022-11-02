package Demo56;

public class Runnableimpl  implements  Runnable{
    //定义一个多线程共享的票源
    private int ticket=100;

    //设置线程任务：买票
    @Override
    public void run() {

        while(true){
            //先判断票是否存在
            if (ticket>0){
              //提高安全问题出现的概率。让程序睡眠    可以没有
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//      买票  ticket--
                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
                ticket--;
            }
        }


    }
}
