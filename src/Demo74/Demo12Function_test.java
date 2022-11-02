package Demo74;

import java.util.function.Function;

/**
 * @Author: hsy
 * @Date: 2022/10/17/21:06
 * @Description:
 */
public class Demo12Function_test {
    public static void main(String[] args) {
        String str="zhaoLiyin,20";
        int result = parse(str, (s) -> {
            String[] split = s.split(",");
            System.out.println(split[1]);
            return split[1];
        }, (s1) -> {
            int parseInt = Integer.parseInt(s1);
            return parseInt;
        }, (i) -> {
            return i + 100;
        });
        System.out.println(result);
    }
    protected static int parse(String message, Function<String,String>function_1,Function<String,Integer>function_2,Function<Integer,Integer> function_3){
        return function_1.andThen(function_2).andThen(function_3).apply(message);
    }
}
