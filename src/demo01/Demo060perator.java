package demo01;
/*
 * 赋值运算符分为：
 * 基本运算符：就是一个等号“=”，代表变量的数据交给左侧的变量。
 * int a=30；   把30给a
 * 符合运算符
 * +=  a+=3      a=a+3
 * -=  b-=4      b=b-4
 * *=  c*=5      c=c*5
 * /=  d/=6      d=d/6
 * %=  e%=7      e=e%7
 * 
 * 注意事项：
 * 1.只要变量才能使用赋值运算符，常量不能进行赋值 （50=30 错误）
 * 2.复合运算符其中蕴含了一个强制类型转换。   👇例子
 */
public class Demo060perator {

	public static void main(String[] args) {
		int a=10;
		//a+a=5；
		//a=10+5；
		//a+15
		a+=5;
		System.out.println(a); //15
		
		int b =10;
		//b =b%3
		//b =10%3
		//b =1
		b%=3;
		System.out.println(b); //1
		
		byte c =100;
		//c =c+5;
		//c =byte+int
		//c=int +int  复合运算符其中蕴含了一个强制类型转换。
		c +=5;
		System.out.println(c);
		System.out.println("===================");
		int aa=1;
		int bb=3;
		System.out.println(aa+bb);//4
		System.out.println(bb-aa);//2			2020.9.13
		System.out.println(bb*aa);//3
		System.out.println(bb/aa);//3
		System.out.println(bb%aa);//0
	}

}
