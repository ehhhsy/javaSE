package Demo17.test_2022;

import java.util.Random;
import java.util.Scanner;

public class weapon {
    String kuodao="����";
    String taidao="̫��";
    String shuangjiegun="˫�ڹ�";
    public String choose_weapon(){
        System.out.println("��ѡ��1��2��3����");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==1){
            return kuodao;
        }else if(number==2){
            return taidao;
        }else if(number==3){
            return shuangjiegun;
        }
        return null;
    }
}
