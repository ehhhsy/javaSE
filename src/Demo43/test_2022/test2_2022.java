package Demo43.test_2022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author hsy
 * @item
 *    1.User input String s£¨
 *    2.use SimpleDateFormat to translate Date
 *    3.Date.getTime translate birthdays to long
 *    4.get the curr_time to translate long
 *    5.long - long
 *    6.birthday-day=time_final /1000/60/60/24
 *    7.birthday-year=time_final /365
 *
 * @time
 */
public class test2_2022 {
    public static void main(String[] args) throws ParseException {
        System.out.println("«Î ‰»ÎXXXX.xx.xx");
        String s = new Scanner(System.in).next();
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy.MM.dd");
        Date date_parse = SDF.parse(s);
        Date date = new Date();
        long brith_time = date_parse.getTime();
        long curr_time = date.getTime();
        long time_final=curr_time-brith_time;
        time_final=time_final/1000/60/60/24;
        System.out.println(time_final/365);
    }
}
