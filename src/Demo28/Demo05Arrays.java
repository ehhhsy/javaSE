package Demo28;
 import java.lang.reflect.Array;
 import java.util.Arrays;
/*
java.util.Array��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ���

  hsy:���ø�ʽ�� Arrays.�����������飩
  public static String toString(����)���������������ַ���                  ����̬������ֱ��ͨ������.���ã�������������������������
  ������Ĭ�ϸ�ʽ��[2, 32, 131, 23]..
  public static void sort(���飩������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������

   ��ע���������ֵ��sortĬ�ϰ��մ�С����
        ������ַ�����sortĬ����ĸ����
        ������Զ�������ͣ���ô����Զ��������Ҫcomparable����Comparator�ӿڵ�֧�֣����ѧϰ��

 */
public class Demo05Arrays {
    public static void main(String[] args) {
        int [] array ={2,32,131,23};
      String a;
//        ��int���Ĭ�ϸ�ʽ
        a = Arrays.toString(array);
        System.out.println(a);  //[2, 32, 131, 23]

        Arrays.sort(array); //����sort������������
        System.out.println(Arrays.toString(array)); //[2, 23, 32, 131]

      String [] array2={"zzz","bbb","ccc"};
        Arrays.sort(array2);         // ������ַ�����sortĬ����ĸ����
        System.out.println(Arrays.toString(array2));  //[bbb, ccc, zzz]

    }
}
