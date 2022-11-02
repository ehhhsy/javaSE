package demo01;
  /*  
   * 一元运算符：只要一个数据才可以进行操作的运算符  例如 取反！ 自增++  自减--
   * 二元运算符：只要二个数据才可以进行操作的运算符  例如  加法+  减法-
   * 三元运算符：只要三个数据才可以进行操作的运算符  
   * 
   * 格式：
   * 数据类型 变量名 = 条件判断？ 表达式A：表达式B
   * 
   * 流程：
   * 首先判断条件是否成立：
   *   如果成立为true ，那么表达式a的值赋值给左侧的变量
   *   如果成立为false ，那么表达式b的值赋值给左侧的变量
   *   
   *   注意事项：
   *   1.必须同时保证表达式A：表达式B都符合左边的数据类型的要求                 int result=3>4 ? 2.5:10;(错误！）
   *   2.三元运算符结果必须被使用 , 要么就赋值。         a>b ?a:b（错误写法）
   */  
public class Demo9Operator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		//数据类型 变量名 = 条件判断？ 表达式A：表达式B
		//判断a>b是否成立，
		int sum =a>b ?a:b;
		System.out.println(sum);
		 System.out.println("============");
		int w=33; 
		boolean q = w>3 ? true :false;
		 System.out.println(q);         //true
       
		 System.out.println("============");
		 //真确写法 ，三元运算符结果必须被使用 ，这也是使用的一种
		 System.out.println(a>b ?a:b);
		 System.out.println(3>4 ? 10.1:3); //3.0
		System.out.println("============");
		int aaa=20;
		int bbb=30;
		int ab=aaa<bbb?aaa:bbb;
		System.out.println(ab); //20     		2020.9.13
		boolean abab=aaa<bbb?true:false;
		System.out.println(abab); //true
		System.out.println(aaa>bbb?a:b);//20

		System.out.println("new one 2022");  //2022.9.15
		int x=50;
		int y=30;
		System.out.println(x<y ? (x=y):(y=x));
		System.out.println(x);
		System.out.println(y);
	}

}
