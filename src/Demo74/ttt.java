package Demo74;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:17
 * @Description:  集合信息的筛选
 */
public class ttt {
    public static void main(String[] args) {
        String initial ="林北不是王雷,36";
        String result = parse(initial, str -> str.split(","), strArr -> {
            String[] splitString = strArr[0].split("不是");
            return splitString[1] + "就是" + splitString[0];
        });
        System.out.println(result);
    }
    protected static String parse(String s, Function<String,String[]>function_1,Function<String[],String>function_2){
        return  function_1.andThen(function_2).apply(s);
    }


}