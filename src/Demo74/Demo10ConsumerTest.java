package Demo74;

import java.util.function.Consumer;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:01
 * @Description: 练习:格式化打印输出
 */
public class Demo10ConsumerTest {
    public static void main(String[] args) {
        //定义一个字符串类型的数组
        String[] arr={"吴亦凡,男","李易峰,男","只因,不详"};
        method01(arr,(message)->{
            //消费方式：对message切割，获取姓名，按照指定格式输出
            String[] splitString = message.split(",");
            System.out.print("姓名  "+splitString[0]);
        },(message)->{
            //消费方式：对message切割，获取年龄，按照指定格式输出
            String[] splitString = message.split(",");
            System.out.println("。性别  "+splitString[1]+"。");
        });
    }

    /**
     * @description  定义方法,消费字符串
     * @param arr:
     * @param consumer_1:
     * @param consumer_2:
     * @return void
     * @author hsy
     * @date 2022/10/17 19:05
     */
    private static void method01(String [] arr, Consumer<String> consumer_1,Consumer<String>consumer_2) {
        //遍历数组
        for (String s : arr) {
            //使用andThen方法，连接两个Consumer接口，消费字符串
            consumer_1.andThen(consumer_2).accept(s);
        }

    }

}
