package Demo6Array;

import java.util.Arrays;

/**
 * @Author: hsy
 * @Date: 2022/11/02/16:40
 * @Description:
 * ��������ļ���ʱ�򣬾ͱ����ɫ��
 *
 * ���Դ�java�ļ��Ƿ����ϴ���github����
 */
public class Demo08Test {
    public static void main(String[] args) {
        //����Ҫ������дһЩ�����ġ�����
        //Щɶ�أ�
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,10};
        System.arraycopy(arr1,3,arr2,3,2);
        Arrays.stream(arr2).forEach(System.out::print); // 67845
    }
}
