package Demo75;

import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/20:13
 * @Description: foreach������ʹ��
 */
public class Demo03foreach {
    public static void main(String[] args) {
        //ͨ�����鴴����
        Stream<String> stringStream = Stream.of("hello", "mixi", "good");
        //ʹ��foreach����������Ϊ���
        stringStream.forEach(name->{
            System.out.println(name);
        });
        //�Ż�
        stringStream.forEach(System.out::println);
    }
}
