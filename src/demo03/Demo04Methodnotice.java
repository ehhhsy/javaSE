package demo03;
//使用方法的时候，注意事项
// 方法应该定义再类当中，但是不能再方法当中再定义方法，'不能嵌套'
//方法定义的前后顺序无所谓
//'方法定义之后不会执行'，如果希望执行，一定要调用；【单独调用，打印调用，赋值调用】；
//如果方法有返回值，那必须写上“return 返回值”，不能没有
//return后面的返回值数据，必须和方法的放回值类型，对应起来
//队友一个void没有返回值的方法，不能写return后面的返回值，只能写“return；”
//对于void方法当中最后一行的return可以省略不写
//一个方法当中可以有多个return语句，但是必须保证同时知有一个会被执行到，两个return不能连写

/**
 * @author hsy
 * @since 10.21
 * @version
 */

public class Demo04Methodnotice {
	public static void main (String [] args) {
		System.out.println(getMax(3,5));    //调用28行方法
		System.out.println(method1());
		method3();
		System.out.println(zuida(5+5,2+11));  //2020.5.30
	}

	/**
	 * 返回10
	 * @return
	 */
   public static int method1() {
	   return 10;   //返回值要写
   }
   public static void method2() {
	   return;// 没问题，
   }

	/**
	 * 输出语句
	 */
	public  static void method3() {
	   System.out.println("zzzzzzzzzzzz");
	   System.out.println("ssssssssssss");
	   return;//最后一行可以不写return
   }
   //第10条例子，题目两个数取最大值

	/**
	 * 获取两数最大数值
	 * @param a
	 * @param b
	 * @return
	 */
   public static int getMax(int a,int  b) {
//	   int max;
//	   if(a>b) {
//		   max =a;             与注意事项无关，只是题目的写法其中1
//	   }
//	   else {
//		   max=b;
//	   }	   
	   if (a>b) {
		   return a;          
	   }                           //这就是第10条例子 ,对的
	   else {
		   return b;
	   }
   }
   public static int zuida (int a,int b) {
	   int big =0;
	   if (a>b) {
		   big+=a;
	   }
	   else{
		   big+=b;
	   }
	   return big;
	   
	   /*
	    * if (a>b) {
		   return a;
	   }
	   else{
		   return b;
	   }
	    */
	    
	    
   }
}
