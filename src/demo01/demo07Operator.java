package demo01;
 /*
  * 比较运算符
  * 大于：        >
  * 小于：        <
  * 大于等于     >=
  * 小于等于     <=
  * 相等              ==  【一个等号是赋值】
  * 不等于        !=
  * 
  * 注意事项：
  * 1.比较运算符结果是boolean值，成立就是true 不成立就是false
  * 2.如果进行多次判断，不能连着写。  
  * 1<X<3 （错误）
  * 1<X && x<3 正确
  */
public class demo07Operator {
	public static void main(String[] args) {
		System.out.println(10>1);
		int a =10;
		int b=20;
		System.out.println(a>b); //false
		System.out.println(a>=100);//false
		System.out.println(a<=100); //true
		System.out.println(b<=20); //true
		 System.out.println("===========");
		 
		 System.out.println(10==10); //true
		 System.out.println(20!=25); //true
		 System.out.println(20!=20); //false

		//2020.9.13
		System.out.println("this is 2022----");
		int x=2;
		System.out.println(1<x || x>3);

	}

}
