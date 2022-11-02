package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        //练习1  匹配任意多个任意字符
//        Pattern compile = Pattern.compile(".*");
//        Matcher matcher = compile.matcher("ababab&^*#");
        //练习2 判断字符串是否匹配
//        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\.\\d{3}");
//        Matcher matcher1 = pattern.matcher("1998-02-03 10:21:09.100");
//        while (matcher1.find()){
//            String group = matcher1.group();
//            System.out.println(group);
//        }
        //练习3 一个字符串只能由字母，数字，_组成，其长度位6-15
//        Pattern pattern1 = Pattern.compile("\\w{6,15}");
//        Matcher matcher = pattern1.matcher("19980203");
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        //练习4 验证一个字符串是否  是小数
//        Pattern pattern1 = Pattern.compile("\\d(\\.\\d+)?");
//        Matcher matcher = pattern1.matcher("10.2");
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//    --------------------------------------------------------------------------------------------------
//        Pattern pattern1 = Pattern.compile("<.+>"); // < -- <     .+  ---aaa<bbb>ccc<ddd>eee>   > ---  回退 >
//        Pattern pattern2 = Pattern.compile("<.+?>"); // <aaa<bbb>   <ddd>
//        Pattern pattern3 = Pattern.compile("<.+>"); // < -- <     .+  ---aaa<bbb>ccc<ddd>eee>   > ---  回退 >
//        Matcher matcher = pattern2.matcher("<aaa<bbb>ccc<ddd>eee>");
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        //    --------------------------------------------------------------------------------------------------逻辑运算符
        Pattern pattern = Pattern.compile(".*?\\(");//规则
        Matcher matcher = pattern.matcher("北京市(海淀区)(朝阳区)(西城区)");
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
