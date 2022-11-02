package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/20:25
 * @Description:   filter������ʹ��
 */
public class Demo04filter {
    public static void main(String[] args) {
        //����һ��stream��
        Stream<String> stringStream = Stream.of("barny","joey","brana");
        //ʹ��filter����
        Stream<String> stringStream_2 = stringStream.filter(str -> str.startsWith("b"));
        stringStream_2.forEach(System.out::println);

        //��ʱstringStream_2�ѱ�ʹ�����,����ʹ�û��׳� IllegalStateException��stream has already been operated upon or closed
//        stringStream_2.forEach(System.out::println);

        //����һ��stream��
        Stream<Integer> integerStream = Stream.of(23, 21, 4, 5, 11);
        integerStream.filter(i->i>20).forEach(System.out::println);
    }
}
