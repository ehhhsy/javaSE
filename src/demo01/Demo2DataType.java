package demo01;
/*
 *  强制类型转换 （显式）                                
 *  特点：代码需要特殊的格式处理，不能自动完成 
 *  你想转化int类型，就在之前100L前面加上（int）
 *  格式:范围小的类型 范围小的变量名 =（范围小的类型） 原本范围大的数据；
 *  
 *  注意事项
 *  1.强制转换不推荐使用，因为有可能发生精度损失，数据溢出
 *  2.byte/short/char这3种类型都可以发生数学运算，如‘A’
 *  3.byte/short/char这3种类型发生数学运算的时候，都首先提升成int类型，然后计算、
 *  4.boolean类型不能发生数据类型转换
 */ 
public class Demo2DataType {

	public static void main(String[] args) {

		//左边是int类型，右边是默认的long类型，左右不一样
		//long》》int 不符合数据范围从小到大
		//不能发生了自动转换
		//格式:范围小的类型 范围小的变量名 =（范围小的类型） 原本范围大的数据；
		int num=(int)100L;
		System.out.println(num);
		
		
//		int num=(int)6000000000L; 错误
//		System.out.println(num);
		
		//double ---int 强制性转换
		int num3 =(int) 3.99;
		System.out.println(num3);  //3 ，精度损失，不是四舍五入

		//计算机的底层会用一个数字（二进制）来代表A，就是65
		
		char zifu1 ='A';
		System.out.println(zifu1+1); //66, A 被当作65处理
	  
		byte num4 =40;
		byte num5 =50;
		//错误，byte/short/char这3种类型发生数学运算的时候，都首先提升成int类型，所以就是两个int相加，就错误
//		byte result1 =num4 + num5;
		int result1 =num4 + num5;
		System.out.println(result1);
		
		short num6 =60;
		//byte+short  ---int +int 》int
		//int强制转换为short，注意num4＋num6没有超过short类型，不然会发生数据溢出
		short result2 =(short)(num4+num6);
		System.out.println(result2);
	}
          
          
}
