package Demo74;

import java.util.function.Function;

/**
 * @Author: hsy
 * @Date: 2022/10/17/20:51
 * @Description:  Function 的 andThen差不多
 */
public class Demo12Function_2 {
    public static void main(String[] args) {
        String tmp="123";
        //第一个lambda表达式把string--->Integer
        //第二个lambda表达式把Integer--->string
        parse(tmp,s->Integer.parseInt(s)+10,i->i+" ");
    }
    /**
     * @description
     * @param s:
     * @param function_1:  Function<String,Integer>
     * @param function_2:  Function<Integer,String>
     * @return void
     * @date 2022/10/17 20:59
     */
    protected static void parse(String s, Function<String,Integer> function_1,Function<Integer,String> function_2){
        String s1 = function_1.andThen(function_2).apply(s);
        System.out.println(s1);
    }
}
