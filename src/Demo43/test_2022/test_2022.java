package Demo43.test_2022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test_2022 {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println("---------------------");
        System.out.println(cal.get(Calendar.YEAR));         //年
        System.out.println(cal.get(Calendar.MONTH)+1);      //月+1
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //日
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //时
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

    }
}
