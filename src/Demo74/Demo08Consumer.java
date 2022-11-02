package Demo74;

import java.util.Collections;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/21:27
 * @Description:
 */
public class Demo08Consumer {
    public static void main(String[] args) {
    method("abcd",(String name)->{
        //对传递的字符串进行消费
        //消费方式:直接输出          System.out.println(name);
        //消费方式:对字符串进行反转
        char[] charArray = name.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = charArray.length-1; i >= 0; i--) {
            builder.append(charArray[i]);
        }
        System.out.println(builder);
    });

    }/**
     * @description  定义一个方法,用consumer接口消费name字符串
     * @param name:
     * @param consumer:
     * @return void
     * @author hsy
     * @date 2022/10/15 21:29
     */
    static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
}
