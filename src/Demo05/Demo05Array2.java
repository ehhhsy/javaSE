package Demo05;

import java.sql.Array;
import java.util.Arrays;

/*
 * 动态初始化：（指定长度在创建数组的时候，直接指定 数组当中的数据元素个数     int[] array= new int[3]
 * 静态初始化：（指定内容）在创建数组的时候，不能指定数据个数多少，而是直接将具体的数据内容进行指定 int[] array= new int[]{2,3,4,5}  int[] array= {3,5,5,2}
 * 
 * 静态初始化基本格式：
 * 数据类型 【】 数组名称 =new 数据类型 【】{元素1,元素,....}
 * 
 * 注意事项：
 * 虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素具体内容，也可以自动推算长度
 * 如：（直接创建一个数组，里面装的全都是int数字，具体为：5，6，7，30）
 * 推算：长度是4
 */
public class Demo05Array2 {
	public static void main(String[] args) {
//		//直接创建一个数组，里面装的全都是int数字，具体为：5，6，7，30
//		int [] array = new int [] {5,6,7,30};
//		int[] array3= {3,4,555555555,6};
//		System.out.println(array3[2]);  //55555
//		//直接创建一个数组，里面装的字符串，具体为："hello","world","java"
//		String [] array1 =new String[] {"hello","world","java"};
//
//   int [] a = new int [3]; //2020.6.4 动态数组
//   int [] b = {1,3,4}; //静态数组
//
//   int [] array6=new int [] {1,3,4,1};  //静态数组    2020.7.20
//   int [] array2= {1,23,23};            //静态数组
//   int [] array4=new int [3];           //动态数组
//
//		System.out.println("=================");
//	int [] array5=new int[3];
//	array5[0]=3;
//	array5[1]=4;
//	array5[2]=5;
//		System.out.println(Arrays.toString(array5)); //[3, 4, 5]	2020.9.16
//		System.out.println("hello");
//	}
		int [] jing={1,2,3,4,5};
		System.out.println(jing[2]);
		int [] dong=new int [3];

	}
}