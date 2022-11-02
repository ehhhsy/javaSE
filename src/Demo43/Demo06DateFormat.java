package Demo43;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text  DateFormat:
DateFormat 是日期/时间格式化子类的【抽象类】
作用：格式化（也就是日期 -> 文本）、解析（文本-> 日期）
怎么变：成员方法：
 String format(Date date) 按照指定的模式，把date日期，格式化为符合模式的字符串  【重点】
 Date parse(String scource)吧符合模式的字符串，解析为date                   【重点】

DateFormat 是抽象类，可以使用子类simpleDateformat
java.text 【SimpleDateFormat】

构造方法
SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造
   参数：传递指定的模式
   模式：区分大小写 y==年  M==月 d==日 H==时 m==分 s==小时
   写对应的模式，会把模式替换成对应的日期和时间
   “yyyy-MM-dd HH:mm:ss”
   “yyyy年MM月dd日 HH时mm分ss秒”

   注意：
   【模式中的字母不可改变，连接模式的符合可以改变】

 */
public class Demo06DateFormat {
    public static void main(String[] args) {
    dmeo01();
        
        
    }
       /*
       使用DayeFormat类中的方法fomat，把日期格式化为文本

        */
    private static void dmeo01() {
//        String format(Date date) 按照指定的模式，把date日期，格式化为符合模式的字符串

//   使用步骤：
//        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
//          2.调用SimpleDateFormat对象中方法format，按照构造方法中指定的模式
//                把date日期格式化为符合模式的字符串（文本）

//        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

//        2.调用SimpleDateFormat对象中方法format，按照构造方法中指定的模式 把date日期格式化为符合模式的字符串（文本）
        Date date = new Date();
        String text = simpleDateFormat.format(date);
        System.out.println(date); //Mon Aug 10 20:02:57 CST 2020
        System.out.println(text); //2020年08月10日 20时02分57秒






    /*
         使用DateFormat类中parse，把文本解析为日期
         Date perse（String source）把符合模式的字符串，解析为Date日期
         使用步骤：
         1.创建simpleDateformat对象，解析方法中传递指定模式
         2.调用simpleDateformat对象中的方法parse,把符合构造方法中模式的字符串解析为Date日期
     */
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月");
        try {
            Date date1 = simpleDateFormat.parse("2020年20月");
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        public Date parse(String source) throws ParseException
//        这个parse声明一个异常叫ParseException异常
//        如果字符串和构造方法中的模式不一样，那么程序就会抛出异常
//        调用一共抛出了异常的方法，就必须的处理这个异常
    }
 }