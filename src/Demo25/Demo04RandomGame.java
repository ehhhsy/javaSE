package Demo25;

import java.util.Random;
import java.util.Scanner;

/*
 * ��Ŀ��
 * �ô���ģ������ֵ���Ϸ
 * 
 * ˼·��
 * 1.������Ҫ����һ��������֣�����һ���������ٷ����仯��Random��nextInt��������
 * 2.��Ҫ�������룬�����õ���Scanner
 * 3.��ȡ������������֣���Scanner���е�nextInt��������
 * 4.�Ѿ��õ����������֣��жϣ�if��һ�£�
 *            ���̫���ˣ�����̫�󣬲������ԣ�
 *            ���̫С�ˣ�����̫С���������ԣ�
 *           ��������ˣ�����������
 * 5.���Ծ�������һ�Σ�ѭ��������ȷ������while��true����������break����
 *    
 */
public class Demo04RandomGame {

	public static void main(String[] args) {
           Random r =new Random();   //����һ���������
           int randdomNum=r.nextInt(100)+1;   //1-100
           Scanner sc =new Scanner(System.in);//����һ��
           System.out.println("��������µ�����  ");

           while(true) {
        	        int guessNum =sc.nextInt(); //��������²������
        	   if(guessNum>randdomNum) {
            	   System.out.println("̫���ˣ�������");
               }else if(guessNum<randdomNum) {
            	   System.out.println("̫С�ˣ�������");
               }else {
            	   System.out.println("����");
            	   break;
               }
           }
           System.out.println("��Ϸ����");


        System.out.println("======================");
        System.out.println("2020.9.28---������");
        int a=new Random().nextInt(50)+1;

        while (true){
            int sca=new Scanner(System.in).nextInt();
            if (sca>a){
                System.out.println("����");
            }else if (sca<a){
                System.out.println("С��");
            }else{
                System.out.println("����");
                break;
            }
        }
	}

}
