package Demo43;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 计算一个人已经出生了多少天

 分析：
 1.使用Scanner类方法next，获取出生日期
 2.使用DateFormat类中的parse，把字符串的出生日期解析为Date格式
 3.把Date格式出生日期转为毫秒值
 4.获取当前的日期，转为毫秒值
 5.使用当前日期的毫秒值-出生日期的毫秒值
 6.把毫秒值转化为天s/1000/60/60/24
 */
public class Demo07Test {
    public static void main(String[] args) throws ParseException {

//        1.使用Scanner类方法next，获取出生日期
        System.out.println("请输入出生日期,格式 yy年MM月dd日");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

//        2.使用DateFormat类中的parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日");

            Date parse = simpleDateFormat.parse(s);



//        3.把Date格式出生日期转为毫秒值
        long bdtime = parse.getTime();

//        4.获取当前的日期，转为毫秒值
        Date date = new Date();
        long time = date.getTime();

//        5.使用当前日期的毫秒值-出生日期的毫秒值
        long l = time-bdtime;

        long ll = l / 1000 / 60 / 60/24;
        System.out.println(ll);


    }




}
