package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/20:25
 * @Description:   filter方法的使用
 */
public class Demo04filter {
    public static void main(String[] args) {
        //创建一个stream流
        Stream<String> stringStream = Stream.of("barny","joey","brana");
        //使用filter方法
        Stream<String> stringStream_2 = stringStream.filter(str -> str.startsWith("b"));
        stringStream_2.forEach(System.out::println);

        //此时stringStream_2已被使用完毕,继续使用会抛出 IllegalStateException：stream has already been operated upon or closed
//        stringStream_2.forEach(System.out::println);

        //创建一个stream流
        Stream<Integer> integerStream = Stream.of(23, 21, 4, 5, 11);
        integerStream.filter(i->i>20).forEach(System.out::println);
    }
}
