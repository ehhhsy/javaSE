package Demo27;

import java.util.Arrays;
import java.util.Scanner;

//��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����

/**
 * 1.�ַ������byte���� s.getBytes();
 * 2.byte���� ���� ASCII�� �����ж�
 */
public class test_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        byte[] bytes = s.getBytes();
        int big_count=0;
        int small_count=0;
        int number_count=0;
        int other_count=0;
        for (int i = 0; i < bytes.length; i++) {
            if (97<=bytes[i] && bytes[i]<=122){         //Сд��ĸ
                small_count+=1;
            }else if(65<=bytes[i] && bytes[i]<=90){
                big_count+=1;
            }else if(48<=bytes[i] && bytes[i]<=57){
                number_count+=1;
            }else{
                other_count+=1;
            }
        }
        System.out.println("��д��ĸ������"+big_count);
        System.out.println("Сд��ĸ������"+small_count);
        System.out.println("���ָ�����"+number_count);
        System.out.println("����������"+other_count);
    }
}
