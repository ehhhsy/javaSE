package demo01;
/* 注意事项：
 * 1，一旦运算符有不同类型数据，那么结果将会是数据类型范围大的那种       下面有例子
 * 2.byte short char 在运算中都会先变成int再运算
 * 
 * 运算符：进行特定的操作，例如：+
 * 表达式：用运算符连起来的式子叫做表达式。例如20+5 又例如a+b
 * 
 * 四则运算符  加减乘除
 * 取模（取余数） ： %
 * 只是对整数的除法来说，取模运算符才有余数的意义。
 * 被除数 /除数 =商。。余数
 * 
 * 对于一个整数（int...）的表达式来说，除数用到是整数，整数除以整数，结果还是整数，只是商，不看余数
 * 
 *
 */
public class Demo03simple {

	public static void main(String[] args) {
		 //两个常量之间可以进行数学运算
		System.out.println(33+2); //35
      
		//两个变量之间也可以进行数学运算
		int a=20;
		int b=30;
		System.out.println(a+b); //50
		
		//变量和常量之间可以混合使用
		System.out.println(a*10); //200
		
		
		int x =10;
		int y= 3;
		int result1 =x/y;
		System.out.println(result1); //3
		
		int result2 =x%y;
		System.out.println(result2); //模 1
		
		//int +double ——》》》  double +double》》》double
		//一旦运算符有不同类型数据，那么结果将会是数据类型范围大的那种   
		double result3=x+2.3;
		System.out.println(result3);   //12.3

		System.out.println("this is hsy form 2022---==---");
		int t1=30;
		int t2=4;
		System.out.println(t1+t2); //34
		System.out.println(t2-t1); //-26
		System.out.println(t1/t2); //7
		System.out.println(t1%t2); //2
		
	}

}
