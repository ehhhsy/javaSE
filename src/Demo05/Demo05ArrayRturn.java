package Demo05;

import java.util.Arrays;

/*����������������������������������������������������������
 * ������Ϊ�����ķŻ�ֵ����
 * һ�����������ж������������ֻ����0����1���Ż�ֵ����˼�ǣ�����return int��avg�������ж������ֵ
 * ���ϣ��һ���������в����˶��������ݽ��з��أ���ô��??
 * ���������ʹ��һ��������Ϊ����ֵ���ͼ���   (�ö���װ������
 * �ܽ�!!
 * �κ��������Ͷ�����Ϊ�����Ĳ�������,���߷Ż�ֵ����
 * 
 * ������Ϊ�����Ĳ�����public static int[] calcuate �������ݽ�ȥ����ʵ��������ĵ�ֵַ
 * ������Ϊ�����ķŻ�ֵ�����ص���ʵҲ������ĵ�ֵַ
 */
public class Demo05ArrayRturn {
	public static void main(String[] args) {
		int [] array1111=calcuate(10,20,30);
		System.out.println(array1111);  //��ʵ���ǰ�array�ĵ�ֵַ��ֵ��array1111��
		System.out.println("3�������Ϊ"+array1111[0]);
		System.out.println("ƽ����Ϊ"+array1111[1]);
       System.out.println("==========");

        int [] array=ssA(1,2,2);   //2020.7.20
         System.out.println(array[0]);
		System.out.println("=================");
		String[] sbljw = sbljw("��", "��", "ʯ");
		System.out.println(Arrays.toString(sbljw));
		System.out.println("--------------------------2022--------------------");
		System.out.println(Arrays.toString(ha("g", "g", "h"))) ;
	}

	public static int[] calcuate (int a,int b,int c) {
		int sum=a+b+c;
		int avg =sum/3;

		//int[] array=new int [2];   ��̬
		     //array[0]=sum;
               //array[1]=avg;
		int []array= {sum,avg};    //��̬
              System.out.println(array); //��ֵַ
               return array;

	}
     public static int [] ssA(int a1,int b1,int c1) {
    	 int sum1=b1+c1+a1;
    	 int avg1=sum1/3;
    	 int [] arr= {sum1,avg1};
    	 return arr;
     }

     public static String [] sbljw(String a,String b,String c){		//2020.9.16
		String [] ab = new String[3];
		ab[0]=a;
		ab[1]=b;
		ab[2]=c;
		return ab;
	 }
	 public static String [] ha(String a,String b,String c){
		 String[] s = new String[3];
		 s[0]=a; s[1]=b; s[2]=c;
		 return  s;
	}
}
