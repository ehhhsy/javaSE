package Demo60;
/*
   生产这(包子铺)类:是一个线程类,可以继承Thread
   设置线程任务(run):生产包子
   对包子的状态进行判断
   true:有包子
        包子铺调用wait方法进入等待状态
   false:没有包子
        包子铺生产包子,交替生产两种包子
            有两种状态(i%2==0)
        包子铺生产好了包子
        修改包子的状态为true
        唤醒吃货线程,让吃货线程吃包子

        注意:
            包子铺和包子线程关系-->通信(互斥)
            必须使用同步技术保证只能有一个执行
            锁对象必须保证唯一,可以使用包子对象作为锁对象
            包子铺和吃货的类就需要把包子对象作为参数传递进来
                1.需要在成员位置创建一个包子变量
                2.使用带参数构造方法,为这个包子变量赋值

 */
public class BaoZiPu extends Thread {
//                1.需要在成员位置创建一个包子变量
    private BaoZi bz;
//                2.使用带参数构造方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count=0;
        //while(true) 让他一直生产包子,不加只能生产一次
        while(true){
            synchronized (bz){
                if (bz.status==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行,包子铺生产包子
                //增加趣味 ,交替生产两种包子
                if (count%2==0){
                    bz.skin="薄皮";
                    bz.filling="玉米";
                }else{
                    bz.skin="猪皮";
                    bz.filling="香菇";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.skin+bz.filling+"包子");

                //为生产包子需要3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //包子有了,修改为true
                bz.status=true;
                //唤醒吃货线程
                bz.notify();
                System.out.println("包子铺生产好了"+bz.skin+bz.filling+"的包子,冲冲冲");
            }
        }

        }
    }

