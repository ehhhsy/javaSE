package Demo30;
//�û���¼ϵͳ   2022
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String account="123@qq.com";
        int passwd=123456;


        int i=0;
        while(true){
            System.out.println("��ӭ�����˺Ź���ϵͳ");
            System.out.println("�������˺�");
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.nextLine();
        if (s.equals(account)){
            System.out.println("����������");
            Scanner sc2 = new Scanner(System.in);
            int ps = sc2.nextInt();
            if(ps==passwd){
                System.out.println("��¼�ɹ�");
                break;
            }else{
                System.out.println("�������");
                i++;
            }
        }else{
            System.out.println("�˺Ŵ���");
            i++;
        }
        if(i>=3){
            System.out.println("�������3������ ����");
            break;
        }
        }
    }
}
