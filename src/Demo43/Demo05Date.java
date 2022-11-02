package Demo43;

import java.util.Date;

public class Demo05Date {
    public static void main(String[] args) {
        demo01();
        Demo02();

        System.out.println(new Date(23231621213215L));

        System.out.println(new Date(51513153215L).getTime());
    }

    private static void demo01() {
        //获取系统当前的日期和时间
        Date date = new Date();
        System.out.println(date);//Mon Aug 10 19:28:52 CST 2020
    }

    /*
         Date类的带参数构造方法
        Date(long date) 传递毫秒值，把毫秒转化为Date日期
     */
    private static void Demo02() {
        System.out.println(new Date(0L));
//        Thu Jan 01 08:00:00 CST 1970
    }


    /*
    long getTime() 吧日期转化为毫秒 System.currentTimeMillis()
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
}
