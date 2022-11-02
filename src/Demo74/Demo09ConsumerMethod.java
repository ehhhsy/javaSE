package Demo74;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/17/18:39
 * @Description: 默认方法andThen  连接两个Consumer接口 再继续消费，谁写前面谁先消费
 */
public class Demo09ConsumerMethod {
    public static void main(String[] args) {
        //调用方法，传递参数
        demo01("hahaHHH",(o1)->{
            System.out.println(o1.toUpperCase(Locale.ROOT));
        },(o1)->{
            System.out.println(o1.toLowerCase(Locale.ROOT));
        });
        //调用demo02（）
        demo02("abcdEFggg",(o1)->{
            System.out.println(o1.toUpperCase(Locale.ROOT));
        },(o1)->{
            System.out.println(o1.toLowerCase(Locale.ROOT));
        });
    }



    /**
     * @description Demo01()
     * @param s:
     * @param consumer_1:
     * @param consumer_2:
     * @return void
     * @author hsy
     * @date 2022/10/17 18:49
     */
    public static void demo01(String s, Consumer<String> consumer_1,Consumer<String> consumer_2){
        consumer_1.accept(s);
        consumer_2.accept(s);
    }
    /**
     * @description: 使用andThen（）方法
     * @param s:
     * @param con1:
     * @param con2:
     * @return void
     * @author hsy
     * @date 2022/10/17 18:56
     */
        private static  void demo02(String s, Consumer<String> con1,Consumer<String> con2) {
        //谁在前面先消费谁
        con1.andThen(con2).accept(s);
    }
}
