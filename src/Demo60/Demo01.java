package Demo60;
/*
测试类:
    包含main方法,程序执行的如果,启动程序
    创建包子对象
    创建包子铺线程,开启,生产包子
    创建吃货线程,开启,吃包子
 */
public class Demo01 {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        BaoZiPu baoZiPu = new BaoZiPu(baoZi);
        ChiHuo chiHuo = new ChiHuo(baoZi);
            baoZiPu.start();
            chiHuo.start();
    }
}
