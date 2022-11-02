package Demo44;

import java.time.Year;
import java.util.Calendar;

/*
   java.until.Calendar类：日历类
   Calendar 类是一个抽象类,里面提供了很多操作日历字段的方法（YEAR,MONTH,DAY_OF_MONTH,HOUR)
   Calendar 类里面有一个静态方法叫getInstance()，该方法放回了canlendar类的子类对象

static Calendar getInstance()
          使用默认时区和语言环境获得一个日历。
 */
public class Demo01Calandar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();//多态
//        System.out.println(instance);

        //成员方法
        //get
        int year = instance.get(Calendar.YEAR);
        System.out.println("年是"+year);
        int month = instance.get(Calendar.MONTH) + 1;//西方的月是0-11月
        System.out.println("月是"+month);
        //set
        instance.set(Calendar.YEAR,2088);//void
        int Year_tow=instance.get(Calendar.YEAR);
        System.out.println(Year_tow);
        //可以同时设置年月日

        instance.set(999,9,11);
        //add
        instance.add(Calendar.YEAR,2);//加两年，void
        int year_three=instance.get(Calendar.YEAR);
        System.out.println(year_three);

        instance.add(Calendar.YEAR,-20);//剪20年
        int year_four=instance.get(Calendar.YEAR);
        System.out.println(year_four);
    }
}
