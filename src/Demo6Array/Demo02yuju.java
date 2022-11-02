package Demo6Array;

import java.util.Random;
import java.util.Scanner;

/*
 * if 。。。else
 */
public class Demo02yuju {

    public static void main(String[] args) {
        int a = 666;
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        System.out.println("告辞");

        System.out.println("===================");      //2020.9.16
        System.out.println("请输入一个int类型的数字");
        Scanner S = new Scanner(System.in);
        int abc = S.nextInt();
        if (abc % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        System.out.println("===================");      //2020.9.27
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("我们中国实在是太棒了")){
            System.out.println("密码正确");
        }else{
            System.out.println(str+"密码不对");
        }
        System.out.println("---------20222-----");
        System.out.println("请输入");
        String s = new Scanner(System.in).next();
        if("2022".equals(s)){
            System.out.println("加油");
        }
    }
}
