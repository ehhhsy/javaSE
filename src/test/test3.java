package test;

import java.util.Arrays;
import java.util.Locale;

//String
public class test3 {
    public static void main(String[] args) {
//        String a="I love";
//        String b=a+"SZ";
//        String c=a+"SZ";
//        String d=a;
//        String e=a;
//        System.out.println(b==c);
//        System.out.println(b.equals(c));
//        System.out.println("-----------------");
//        System.out.println(d==e);
//        System.out.println(d.equals(e));
        String a="hsynb123";
        String b="HSYNB123";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(b));
        System.out.println(a.length());
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(b.toLowerCase(Locale.ROOT));
        System.out.println("666".concat(b));
        System.out.println(a.indexOf("1"));    //·µ»ØË÷Òý
        System.out.println(b.substring(5))  ;  //5-end
        System.out.println(b.substring(0,5));  //¡¾0-5)
        char[] chars = a.toCharArray();
        System.out.println("=========");
        for (char aChar : chars) {
            System.out.print(aChar);
            System.out.print("\t");
        }
        System.out.println("===============");
        System.out.println("hsy".compareTo(a));
        System.out.println(a.compareTo("hsynb"));
        System.out.println(a.replace("hsy",""));

        int []  arr={23,434,231,35,22,1313,22};
        String s = Arrays.toString(arr);
        System.out.println(s);
        Arrays.sort(arr);
        String s1 = Arrays.toString(arr);
        System.out.println(s1);
    }
}
