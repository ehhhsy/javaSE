package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//date
public class test5 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        System.out.println(format);

        String brith="2001-1-9";
        Date parse = sdf.parse(brith);
        String format1 = sdf.format(parse);
        System.out.println(format1);
        System.out.println("================");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("================");
        System.out.println(System.currentTimeMillis());
        int [] arr1={1,2,3,4,5,6};
        int [] arr2={7,8,9,10};
        System.arraycopy(arr1,3,arr2,0,3);
        for (int i : arr1) {
            System.out.print(i+"\t");
        }
        System.out.println("");
        for (int i : arr2) {
            System.out.print(i+"\t");
        }
    }
}
