package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        //使用正则表达式 \d+ 来实现           判断字符串是否数字
//        1.把 正则字符串 编译成一个正则匹配模式
//        Pattern pattern = Pattern.compile("\\d+");  //多加一个 \ 转义

//          2.使用这个正则模式去匹配字符串
//            需要CharSequence，String实现了CharSequence,得到了匹配者
//        String a="1223";
//        Matcher matcher=pattern.matcher(a);
//        3.是否能匹配字符串
//        boolean isMatched = matcher.matches();

//        boolean isMatched = Pattern.matches("\\d+", a);//一行搞定
//----------------------------------------------------------------------------
//        单个！！！！！！！！！！！
//        boolean matches = Pattern.matches("b", "a");  //no
//        boolean matches = Pattern.matches("[abc]", "a");  //yes abc其中一个，单个，ab，ac，abc都不行
//        boolean matches = Pattern.matches("[^abc]", "h");  //yes 匹配abc之外
//        boolean matches = Pattern.matches("[a-z]", "H");  //no 小写a-z
//        boolean matches = Pattern.matches("[a-zA-Y]", "H");  //yes 小写a-z A-Y
//        boolean matches = Pattern.matches("[a-z&&[def]]", "d");  //yes 小写a-z并在def其中之一
//        boolean matches = Pattern.matches("[0-9]", "2");  //yes 0-9
//        if (matches){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    --------------------------------------------------
//        多个！！！！！！！！！！！！！！
//        System.out.println(Pattern.matches("a?",""));   // 0/1次
//        System.out.println(Pattern.matches("a*",""));   // 0/多次
//        System.out.println(Pattern.matches("a+",""));   // 1/多次
//    -----------------------------------------------------
//      find  matcher.group()
//        Pattern pattern = Pattern.compile("a*");
//        Matcher matcher = pattern.matcher("aaaa");
//        boolean isFound = matcher.find();  //find 看看是否找到 返回值boolean
//        if (isFound){
//            System.out.println(matcher.group());  //找到的值 aaaa
//        }
//------------------------------------------------------------

    }
}