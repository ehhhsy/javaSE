package Demo75;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/18:31
 * @Description: ʹ����
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("���޼�");
        arraylist.add("������");
        arraylist.add("����");
        arraylist.add("��ǿ");
        arraylist.add("������");

        //ֻҪ��ͷֻ���ŵ�Ԫ��
        //������ֻ��3�����ȵĹ���
        //��������
        Stream<String> stringStream = arraylist.stream();
        stringStream.filter((name)->{
            return name.startsWith("��")&& name.length()==3;
        }).forEach((name)->{
            System.out.println(name);
        });
    }
}
