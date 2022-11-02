package Demo05;

import java.util.Arrays;

/*！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * 数组作为方法的放回值类型
 * 一个方法可以有多个参数，但是只能有0或者1个放回值（意思是，不能return int，avg）不能有多个返回值
 * 如果希望一个方法当中产生了多个结果数据进行返回，怎么办??
 * 解决方法：使用一个数组作为返回值类型即可   (拿东西装起来）
 * 总结!!
 * 任何数据类型都能作为方法的参数类型,或者放回值类型
 * 
 * 数组作为方法的参数（public static int[] calcuate ），传递进去的其实就是数组的地址值
 * 数组作为方法的放回值，返回的其实也是数组的地址值
 */
public class Demo05ArrayRturn {
	public static void main(String[] args) {
		int [] array1111=calcuate(10,20,30);
		System.out.println(array1111);  //其实就是把array的地址值赋值给array1111，
		System.out.println("3个数相加为"+array1111[0]);
		System.out.println("平均数为"+array1111[1]);
       System.out.println("==========");

        int [] array=ssA(1,2,2);   //2020.7.20
         System.out.println(array[0]);
		System.out.println("=================");
		String[] sbljw = sbljw("王", "安", "石");
		System.out.println(Arrays.toString(sbljw));
		System.out.println("--------------------------2022--------------------");
		System.out.println(Arrays.toString(ha("g", "g", "h"))) ;
	}

	public static int[] calcuate (int a,int b,int c) {
		int sum=a+b+c;
		int avg =sum/3;

		//int[] array=new int [2];   动态
		     //array[0]=sum;
               //array[1]=avg;
		int []array= {sum,avg};    //静态
              System.out.println(array); //地址值
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
