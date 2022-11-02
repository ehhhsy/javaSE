package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/21:29
 * @Description:  静态方法 concat
 */
public class Demo07Concat {
    public static void main(String[] args) {
        Stream<String> stringStream_1 = Stream.of("zhang3", "li4", "wang5");
        Stream<String> stringStream_2 = Stream.of("zhao6", "tian7", "lao8");
        //使用concat方法，连接
        Stream<String> sum_stringStream = Stream.concat(stringStream_1, stringStream_2);
        sum_stringStream.forEach(System.out::println); //全部输出出来了
    }
}
