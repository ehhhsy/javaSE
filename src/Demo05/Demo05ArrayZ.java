package Demo05;

import java.lang.reflect.Array;
import java.util.Arrays;

/* ��������������������������������������������
  * ������Ϊ�����Ĳ���
  *  ��ס���κ��������ͣ�������Ϊ�����Ĳ���
  * ������Ϊ��������
  * �����÷�����ʱ���򷽷���С���Ž��д��Σ����ݽ�ȥ����ʵ����     ***����ĵ�ֵַ **
  * 
  * ����һ����������������
  * 
  */
public class Demo05ArrayZ {

	public static void main(String[] args) {
		int [] array= {10,30,40,50};
		System.out.println(array+ " array");
		int [] arraya= {1,3,4,5};
		
		printArray(arraya); 
		System.out.println(arraya);	
		System.out.println("����arraya�ĵ�ֵַ");
		int [] arraycccccc= {111,222,333,50};
		
		printArray(arraycccccc);    
		System.out.println(arraycccccc);   
		System.out.println("����arraycccccc�ĵ�ֵַ");
		
		System.out.println("==========");  //2020.7.18 ����һ����������ӡ����
		double [] a= {2.3,1,1,3};
		printA(a);
		//�Ҵ�ӡ����������һ������
		/*
		 * ��Ҫ��
		 * ����ֵ���ͣ�ֻ�ǽ��д�ӡ������Ҫ���㣬Ҳû�н������void
		 * �������ƣ�printArray
		 * �����б��������������ܴ�ӡ���Ҳ��ܴ�ӡ���е�Ԫ�أ�int[] array
		 */
		System.out.println("=================================");
		int [] abc={1,2,3};
		int [] def={10,221,311};
		System.out.println(Arrays.toString(arraysbljw(abc)));  //[1, 2, 200]
		System.out.println(Arrays.toString(arraysbljw(def))); //[1, 2, 200]
		System.out.println("--------------------2022----------------");
		int [] arr={2,3,4,5,6};
		select_arr(arr);
		select_arr(arr,3);
}
	public static void printArray (int [] array) {
		System.out.println(array+"     ˭���þ���˭�ĵ�ֵַ");              //
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		}
     public static void printA (double []  a) {
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
     }

		public static int [] arraysbljw(int [] array){			//2020.9.16
			array[2]=200;
			return array;
		}
		public static void select_arr(int [] arr){
			System.out.println("��ʼ��ӡ");
			for (int i:arr
				 ) {
				System.out.print(i);
			}
			System.out.println("��ӡ����");
	}
		public static void select_arr(int [] arr,int index){
			System.out.println(index+"��Ԫ����"+arr[index]);
		}


}
