package Demo05;

import java.lang.reflect.Array;

public class DemoAarrayTwo {
     public static void main (String [] args) {
    	 int [] arrayA =new int [3];
 		System.out.println(arrayA);
 		System.out.println(arrayA[0]);//0
 		System.out.println(arrayA[1]);//0
 		System.out.println(arrayA[2]);//0
 		System.out.println("===========");		
 		arrayA[1]=10;
 		arrayA[2]=20;
 		System.out.println(arrayA[0]);
 		System.out.println(arrayA[1]); //10 
 		
 		System.out.println(arrayA[2]); //20
 		
 		//将arrayA数组的地址值，赋值给arrayB数组
 		int [] arrayB =arrayA;
 		System.out.println(arrayB);
 		System.out.println(arrayB[0]);//0
 		System.out.println(arrayB[1]);//10
 		System.out.println(arrayB[2]);//20
 		System.out.println("===========");		
 		
 		arrayB[1]=100;
 		arrayB[2]=200;
 		System.out.println(arrayB[0]);
 		System.out.println(arrayB[1]); //100
 		System.out.println(arrayB[2]); //200
 		System.out.println("===========");	
 		int [] arrayC=new int [3];   //2020.6.4 拒绝懒狗
 		arrayC [0]=3333; 
 		for (int i=0;i<arrayC.length;i++) {
 			System.out.print(arrayC[i]+"  ");
 		}
 		System.out.println("=============");
 		int [] r= new int [3];
 		r[1]=3;
 		System.out.println(r[1]);
		 System.out.println("=============");
		float [] arr={231.1F,2.11F,75.1F};
		 System.out.println(arr);  //[F@312b1dae			2020.9.16
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	 }
}
