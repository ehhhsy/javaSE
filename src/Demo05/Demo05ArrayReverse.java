package Demo05;

import java.util.Scanner;

/*   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 数组元素的反转：其实就是对称位置的元素互换
 * 本来的样子：{1，2，3，4}
 * 之后的样子：{4，3，2，1}
 * 要求，要使用同个数组
 */
public class Demo05ArrayReverse {
	public static void main(String[] args) {
		int []array= {10,23,44,55,66,77};
		//正常遍历数组
		for(int i= 0;i<array.length;i++) {
			System.out.println(array[i]+"  ");
		}
		System.out.println("======================");
		/*
		 * 初始化语句，int min=0,int max=array.length-1;
		 * 条件判断：min<max; 
		 * 步进表达式：min++,max--
		 * 循环体：用第三给变量倒手 temp
		 */
		for(int min=0, max=array.length-1;min<max;min++,max--) {     //注意理解
			int temp=array[min];
			array[min]=array[max];
			array[max]= temp;
			
		}
	  	//反转完成再次遍历数组
		for(int i= 0;i<array.length;i++) {
			System.out.println(array[i]+"");
		}
		System.out.println("======================");
	    /*for (int min=0,max=array.length-1;min<max;min++,max--) {
	    	int tmp = array[min];
	    	array[min]=array[max];
	    	array[max]=tmp;
	    }
	    for(int i= 0;i<array.length;i++) {
			System.out.println(array[i]+"");  //2020.6.4
		}
		*//* int [] ar= {1,3,4,2};
		 for(int i=0;i<ar.length;i++) {
       	  System.out.print(ar[i]);
         }
             System.out.println("==========");
              
              for(int min=0, max=ar.length-1;min<max;min++,max--) {  2020.7.20
            	   int t=ar[min];
            	  ar[min]=ar[max]; 
            	  ar[max]=t;
            	   
              }
              for(int i=0;i<ar.length;i++) {
            	  System.out.print(ar[i]);
              }*/
		System.out.println("=========================");
//		System.out.println( new Scanner(System.in).next());

		System.out.println("============2022===========");
		//反转数组 2022
		int[] arr2 = {1, 3, 4, 7, 9, 6};

		for (int f=0, l=arr2.length-1;f<l;f++,l--){
				int tmp=arr2[f]; //arr[5]    arr[4]         arr[3]
				arr2[f]=arr2[l];  //arr[5]=arr[0]  arr[4]=arr[1]  arr[3] =arr[2]
				arr2[l]=tmp; //arr[0]=arr[5]  arr[1]=tmp    arr[2] =tmp
             }
		for (int i=0;i<arr2.length;i++){
			System.out.print (arr2[i]);
		}
	}

}
