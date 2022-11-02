package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/20:13
 * @Description: foreach方法的使用
 */
public class Demo03foreach {
    public static void main(String[] args) {
        //通过数组创建流
        Stream<String> stringStream = Stream.of("hello", "mixi", "good");
        //使用foreach方法，动作为输出
        stringStream.forEach(name->{
            System.out.println(name);
        });
        //优化
        stringStream.forEach(System.out::println);
    }
}
