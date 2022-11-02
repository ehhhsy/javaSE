package Demo05;

import java.lang.reflect.Array;
import java.util.Arrays;

/* ！！！！！！！！！！！！！！！！！！！！！！
  * 数组作为方法的参数
  *  记住：任何数据类型，都能作为方法的参数
  * 数组作为方法参数
  * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实就是     ***数组的地址值 **
  * 
  * 定义一个方法：遍历数组
  * 
  */
public class Demo05ArrayZ {

	public static void main(String[] args) {
		int [] array= {10,30,40,50};
		System.out.println(array+ " array");
		int [] arraya= {1,3,4,5};
		
		printArray(arraya); 
		System.out.println(arraya);	
		System.out.println("上面arraya的地址值");
		int [] arraycccccc= {111,222,333,50};
		
		printArray(arraycccccc);    
		System.out.println(arraycccccc);   
		System.out.println("上面arraycccccc的地址值");
		
		System.out.println("==========");  //2020.7.18 定义一个方法，打印数组
		double [] a= {2.3,1,1,3};
		printA(a);
		//我打印其他的数组一样可以
		/*
		 * 三要素
		 * 返回值类型：只是进行打印，不需要计算，也没有结果，用void
		 * 方法名称：printArray
		 * 参数列表：必须给我数组才能打印，我才能打印其中的元素，int[] array
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
		System.out.println(array+"     谁调用就是谁的地址值");              //
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
			System.out.println("开始打印");
			for (int i:arr
				 ) {
				System.out.print(i);
			}
			System.out.println("打印结束");
	}
		public static void select_arr(int [] arr,int index){
			System.out.println(index+"号元素是"+arr[index]);
		}


}
