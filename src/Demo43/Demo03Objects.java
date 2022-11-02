package Demo43;

import java.util.Objects;

//ojjects工具类
public class Demo03Objects {
    public static void main(String[] args) {
//        String str1="abc";
//        String Str2="aaa";
//        boolean b = str1.equals(Str2);
//        System.out.println(b);//false

        String str1=null;
        String Str2="aaa";
//        boolean b = str1.equals(Str2);
//        System.out.println(b);//空指针异常

        //可以防止空指针异常，
        boolean equals = Objects.equals(Str2, str1);
        System.out.println(equals);//false
    }
}
