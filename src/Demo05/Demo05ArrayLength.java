package Demo05;

import java.lang.reflect.Array;

/*!!!!!!!!!!!!!!!!!!!!!!!!!
 * ����������ĳ��ȣ���ʽ��
 * ��������.length
 *
 * ���õ�һ��int���֣���������ĳ���
 * 
 * ����һ�����������������ڼ䣬���Ȳ��ɸı�  ����ͼ
 */

public class Demo05ArrayLength {
	public static void main(String[] args) {
		int [] arrayA =new int [3]; //��̬
		
		int [] arrayB= {3,4,5,3,4,4,54,65,76,7,76,75,75,75,7,67,56};//��̬
	
	     int l = arrayB.length;
	     System.out.println(l);
	     
	     int [] arrayC =new int [3];
	     System.out.println(arrayC.length);  //3  ����ͼ
	     arrayC =new int [5];                    
	     System.out.println(arrayC.length); //5    ����ͼ
           
	     System.out.println("==============");
	     int [] sv= {23,131,43,23};   //2020.7.20
	     int s=Array.getLength(sv);
	     System.out.println(s);


		System.out.println("===========================");
		String [] ldz={"lu","jun","wen"};
		System.out.println(ldz.length); //3

	}
	

}
