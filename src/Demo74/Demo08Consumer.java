package Demo74;

import java.util.Collections;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/21:27
 * @Description:
 */
public class Demo08Consumer {
    public static void main(String[] args) {
    method("abcd",(String name)->{
        //�Դ��ݵ��ַ�����������
        //���ѷ�ʽ:ֱ�����          System.out.println(name);
        //���ѷ�ʽ:���ַ������з�ת
        char[] charArray = name.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = charArray.length-1; i >= 0; i--) {
            builder.append(charArray[i]);
        }
        System.out.println(builder);
    });

    }/**
     * @description  ����һ������,��consumer�ӿ�����name�ַ���
     * @param name:
     * @param consumer:
     * @return void
     * @author hsy
     * @date 2022/10/15 21:29
     */
    static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
}
