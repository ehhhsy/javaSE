package Demo74;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ���һ�������ķ���ֵ������һ������ʽ�ӿڣ���ô���Է���һ��lambda���ʽ
 * ����Ҫͨ��һ����������ȡjava.util.Comparator�ӿ����͵Ķ�����Ϊ������ʱ�����Ե��ô˷���
 */
public class demo05 {
    public static void main(String[] args) {
        String [] arr={"aaaaaa","world","java222","hello"};
        System.out.println("����ǰ"+Arrays.toString(arr));     ///[aaaaaa, world, java222, hello]
        Comparator<String> comparator = getComparator();
        Arrays.sort(arr,comparator);
        System.out.println("�����"+Arrays.toString(arr));     //[java222, aaaaaa, world, hello]

    }
    //����һ�������������ķ���ֵ����
    public static Comparator<String> getComparator(){
        //�����ķ���ֵ������һ���ӿڣ����ǿ��Է�������ӿڵ������ڲ���
         return new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 //��ס�ַ����ĳ��Ƚ�������
                 return o2.length()-o1.length();
             }
         };
         //�����ķ���ֵ������һ������ʽ�ӿڣ����ǿ��Է���lambda���
//            return (String o1,String o2)->{
//                //�����ַ����Ľ�������
//                return o2.length()-o1.length();
//            };
    }
}
