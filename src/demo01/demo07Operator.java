package demo01;
 /*
  * �Ƚ������
  * ���ڣ�        >
  * С�ڣ�        <
  * ���ڵ���     >=
  * С�ڵ���     <=
  * ���              ==  ��һ���Ⱥ��Ǹ�ֵ��
  * ������        !=
  * 
  * ע�����
  * 1.�Ƚ�����������booleanֵ����������true ����������false
  * 2.������ж���жϣ���������д��  
  * 1<X<3 ������
  * 1<X && x<3 ��ȷ
  */
public class demo07Operator {
	public static void main(String[] args) {
		System.out.println(10>1);
		int a =10;
		int b=20;
		System.out.println(a>b); //false
		System.out.println(a>=100);//false
		System.out.println(a<=100); //true
		System.out.println(b<=20); //true
		 System.out.println("===========");
		 
		 System.out.println(10==10); //true
		 System.out.println(20!=25); //true
		 System.out.println(20!=20); //false

		//2020.9.13
		System.out.println("this is 2022----");
		int x=2;
		System.out.println(1<x || x>3);

	}

}
