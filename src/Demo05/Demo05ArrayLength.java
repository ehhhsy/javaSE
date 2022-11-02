package Demo05;

import java.lang.reflect.Array;

/*!!!!!!!!!!!!!!!!!!!!!!!!!
 * 如果获得数组的长度，格式：
 * 数组名称.length
 *
 * 将得到一个int数字，代表数组的长度
 * 
 * 数组一旦创建，程序运行期间，长度不可改变  看截图
 */

public class Demo05ArrayLength {
	public static void main(String[] args) {
		int [] arrayA =new int [3]; //动态
		
		int [] arrayB= {3,4,5,3,4,4,54,65,76,7,76,75,75,75,7,67,56};//静态
	
	     int l = arrayB.length;
	     System.out.println(l);
	     
	     int [] arrayC =new int [3];
	     System.out.println(arrayC.length);  //3  看截图
	     arrayC =new int [5];                    
	     System.out.println(arrayC.length); //5    看截图
           
	     System.out.println("==============");
	     int [] sv= {23,131,43,23};   //2020.7.20
	     int s=Array.getLength(sv);
	     System.out.println(s);


		System.out.println("===========================");
		String [] ldz={"lu","jun","wen"};
		System.out.println(ldz.length); //3

	}
	

}
