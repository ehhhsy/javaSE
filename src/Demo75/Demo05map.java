package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/21:03
 * @Description:
 */
public class Demo05map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3");
        //使用map方法
         Stream<Integer> integerStream=stringStream.map(str -> Integer.parseInt(str)+30);
         integerStream.forEach(System.out::println);  //31 32 33
    }
}
