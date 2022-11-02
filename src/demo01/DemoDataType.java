package demo01;
/*
 当数据类型不一样时，将会发生数据类型转换
 自动类型转换（隐式）
   特点：代码不需要进行特殊处理，自动处理
  规则： 数据范围从小到大,
  
 */
public class DemoDataType {

	public static void main(String[] args) {
		System.out.println(1024); //这是个整数，默认是int类型
		System.out.println(3.14); //默认double
		
		//左边是long类型，右边是默认的int类型，左右不一样
		//int 》》long 符合数据范围从小到大
		//发生了自动转换
		long num1 =100;
		System.out.println(num1); //100
		
		
		//左边是double类型，右边是float类型，左右不一
		//float --double 符合数据范围从小到大
		//发生了自动转换
         double num2 =2.33F;
         System.out.println(num2);
         
       //左边是float类型，右边是long类型，左右不一
 		//long --float 符合数据范围从小到大
 		//发生了自动转换
         float num3 =30L;
         System.out.println(num3);
		System.out.println("==============");
         double aa=32.1F;
		System.out.println(aa);
         long aaa=231;
		System.out.println(aaa);
         float aaaa=23221L;
		System.out.println(aaaa);








	}
}
