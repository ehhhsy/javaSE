package Demo6Array;

import java.util.Random;
import java.util.Scanner;

/*
 * if ������else
 */
public class Demo02yuju {

    public static void main(String[] args) {
        int a = 666;
        if (a % 2 == 0) {
            System.out.println("ż��");
        } else {
            System.out.println("����");
        }
        System.out.println("���");

        System.out.println("===================");      //2020.9.16
        System.out.println("������һ��int���͵�����");
        Scanner S = new Scanner(System.in);
        int abc = S.nextInt();
        if (abc % 2 == 0) {
            System.out.println("ż��");
        } else {
            System.out.println("����");
        }
        System.out.println("===================");      //2020.9.27
        System.out.println("������һ���ַ���");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("�����й�ʵ����̫����")){
            System.out.println("������ȷ");
        }else{
            System.out.println(str+"���벻��");
        }
        System.out.println("---------20222-----");
        System.out.println("������");
        String s = new Scanner(System.in).next();
        if("2022".equals(s)){
            System.out.println("����");
        }
    }
}
