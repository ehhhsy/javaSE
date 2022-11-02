package Demo27;

import java.util.Arrays;
import java.util.Scanner;

//键盘输入一个字符串，并且统计其中各种字符出现的次数。

/**
 * 1.字符串变成byte数组 s.getBytes();
 * 2.byte数组 根据 ASCII码 进行判断
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
            if (97<=bytes[i] && bytes[i]<=122){         //小写字母
                small_count+=1;
            }else if(65<=bytes[i] && bytes[i]<=90){
                big_count+=1;
            }else if(48<=bytes[i] && bytes[i]<=57){
                number_count+=1;
            }else{
                other_count+=1;
            }
        }
        System.out.println("大写字母个数是"+big_count);
        System.out.println("小写字母个数是"+small_count);
        System.out.println("数字个数是"+number_count);
        System.out.println("其他个数是"+other_count);
    }
}
