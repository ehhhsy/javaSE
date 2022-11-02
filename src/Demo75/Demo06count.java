package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/21:12
 * @Description: Count方法  和 limit方法  和 ship方法
 */
public class Demo06count {
    public static void main(String[] args) {
        Stream<Integer> integerStream_1 = Stream.of(1, 23, 3, 5, 6);
        //使用count方法
        long l = integerStream_1.count();
        System.out.println(l);  //5

        System.out.println("==================");
        Stream<Integer> integerStream_2 = Stream.of(1, 23, 3, 5, 6);
        Stream<Integer> limit = integerStream_2.limit(3);
        limit.forEach(System.out::println);  // 1,23,3


        System.out.println("===============");
        Stream<Integer> integerStream_3 = Stream.of(1,6,5,8,5,4);
        //使用ship方法，跳过前4个元素
        Stream<Integer> skip_integerStream = integerStream_3.skip(4);
        skip_integerStream.forEach(System.out::print); //54

    }
}
