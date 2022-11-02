package Demo74;

import java.util.function.Function;

/**
 * @Author: hsy
 * @Date: 2022/10/17/20:40
 * @Description: java.util.function.function<T R> 使用 function接口把 String 转化为 Integer
 */
public class Demo12Function_1 {
    public static void main(String[] args) {
        Integer integer = parse("10255", (s) -> {
            int i = Integer.parseInt(s);
            return i;
        });
        System.out.println(integer);
        System.out.println(integer+20);

    }
    /**
     * @description 定义一个方法，String 转化为 Integer
     * @param s: 字符串
     * @param function: function接口
     * @return Integer
     * @date 2022/10/17 20:42
     */
    protected static Integer parse(String s, Function<String,Integer> function){
        return function.apply(s);
    }
}
