package Demo23;
/*
 * ��Ŀ����������3��int���֣�Ȼ��������е����ֵ
 * 
 * ˼·��
 * 1.��Ȼ�Ǽ������룬�϶���Ҫ�õ�Scanner
 * 2.Scanner�������裺������������ʹ��
 * 3.��Ȼ���������֣���ô��������nextInt�����������õ�����int����
 * 4.�޷�ͬʱ�ж������������Ӧ��ת��Ϊǰ���β���
 * 4.1�����ж�ǰ��������˭�����ǰ���������ֵ
 * 4.2����ǰ�����е����ֵ���ٺ͵��������ֱȽϣ��õ��������ֵ��е����ֵ
 * 5.��ӡ���
 */
import java.util.Scanner;

public class Demo03Scanner {
       public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		/*if(num1>num2&&num1>num3) {   //�Լ���˼· ifʵ��
			System.out.println("���ֵ��"+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("���ֵ��"+num2);
	}else if(num3>num1&&num3>num2) {
		System.out.println("���ֵ��"+num3);
}*/
	 int a = num1>num2 ?num1:num2;  //�̵̳ķ���
	 int b= a>num3?a:num3;
	 System.out.println("��������"+b);

		   System.out.println("================");
		   System.out.println("������3��int����");
		   int a1=new Scanner(System.in).nextInt();
		   int a2=new Scanner(System.in).nextInt();
		   int a3=new Scanner(System.in).nextInt();
			int aa=a1>a2?a1:a2;
			int bb=aa>a3?aa:a3;
		   System.out.println(bb);
}
}
