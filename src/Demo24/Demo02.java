package Demo24;
 import java.util.Scanner;
 //����������Ϊ�����ķ���ֵ�Ͳ���
public class Demo02 {
	public static void main(String[] args) {
		//��ͨʹ�÷�ʽ
//		 Scanner sc =new Scanner(System.in);
//		 int num =sc.nextInt();
		
		//��������ķ�ʽ
	/*	System.out.println("������");
		int num = new Scanner(System.in).nextInt();
		System.out.println("������"+num);
		*/	
		
		
		//ʹ��һ��д��
		/*Scanner sc =new Scanner(System.in);
		method(sc);*/
		
		//ʹ���������������д���
		 method(new Scanner(System.in));
		 System.out.println("=========");
		 
		 //ʹ������������Ϊ�����ķ���ֵ
		 int a=methodReturn().nextInt();
		 System.out.println(a);
	}
	
	public static void method (Scanner sc) {
		int a=sc.nextInt();
		System.out.println(a);
	}
	
	public static Scanner methodReturn() {
		////ʹ������������Ϊ�����ķ���ֵ
		//Scnner sc =new Scanner(System.in);
//		return sc;
		return new Scanner(System.in);
	}
}
