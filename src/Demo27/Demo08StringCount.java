package Demo27;

import java.util.Scanner;
//public int indexOf(String str):
/*
 * ��Ŀ��
 * ��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
 * �����У���д��ĸ��Сд��ĸ�����֣�����
 * 3.�����ĸ��������ֱ���������ַ����Գ��ֵĴ���
 * 4.��Ҫ���ַ���һ���֣�һ���ּ�飬String --��char[] ��������tocharAarray() 
 * 5.����char�������飬�Ե�ǰ�ַ�����������жϣ��������ĸ���������++����
 * 6.��ӡ�����ĸ��������ֱ���������ַ����ִ���
 *  
 *  */
public class Demo08StringCount {
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.err.println("������һ���ַ���");
	  String s1 =sc.next();  //��ȡ�ַ���
	  
	  int countUpper=0;  //��д��ĸ
	  int countLower=0;  //Сд��ĸ
	  int countNumber=0; //����
	  int countOther=0;  //�����ַ�
	  char [] array =s1.toCharArray();
	  for (int i = 0; i < array.length; i++) {
	        char ch =array[i];  //��ǰ�ַ�
	        if('A' <=ch&&ch <='Z'){
	        		countUpper++;
	} else if ('a' <=ch&&ch <='z') {
		            countLower++;
	}else if('0' <=ch&&ch <='9') {
		countNumber++;
	}else {
		countOther++;
	}
}
	    System.out.println("��д��ĸ�� "+countUpper);
	    System.out.println("Сд��ĸ�� "+countLower);
	    System.out.println("������  "+countNumber);
	    System.out.println("�����ַ���  "+countOther);
}
}
