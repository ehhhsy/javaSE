package Demo74;

import java.util.function.Consumer;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:01
 * @Description: ��ϰ:��ʽ����ӡ���
 */
public class Demo10ConsumerTest {
    public static void main(String[] args) {
        //����һ���ַ������͵�����
        String[] arr={"���ෲ,��","���׷�,��","ֻ��,����"};
        method01(arr,(message)->{
            //���ѷ�ʽ����message�и��ȡ����������ָ����ʽ���
            String[] splitString = message.split(",");
            System.out.print("����  "+splitString[0]);
        },(message)->{
            //���ѷ�ʽ����message�и��ȡ���䣬����ָ����ʽ���
            String[] splitString = message.split(",");
            System.out.println("���Ա�  "+splitString[1]+"��");
        });
    }

    /**
     * @description  ���巽��,�����ַ���
     * @param arr:
     * @param consumer_1:
     * @param consumer_2:
     * @return void
     * @author hsy
     * @date 2022/10/17 19:05
     */
    private static void method01(String [] arr, Consumer<String> consumer_1,Consumer<String>consumer_2) {
        //��������
        for (String s : arr) {
            //ʹ��andThen��������������Consumer�ӿڣ������ַ���
            consumer_1.andThen(consumer_2).accept(s);
        }

    }

}
