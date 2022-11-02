package Demo24;
 import java.util.Scanner;
 //匿名对象作为方法的返回值和参数
public class Demo02 {
	public static void main(String[] args) {
		//普通使用方式
//		 Scanner sc =new Scanner(System.in);
//		 int num =sc.nextInt();
		
		//匿名对象的方式
	/*	System.out.println("请输入");
		int num = new Scanner(System.in).nextInt();
		System.out.println("数字是"+num);
		*/	
		
		
		//使用一般写法
		/*Scanner sc =new Scanner(System.in);
		method(sc);*/
		
		//使用匿名对象来进行传参
		 method(new Scanner(System.in));
		 System.out.println("=========");
		 
		 //使用匿名对象作为方法的返回值
		 int a=methodReturn().nextInt();
		 System.out.println(a);
	}
	
	public static void method (Scanner sc) {
		int a=sc.nextInt();
		System.out.println(a);
	}
	
	public static Scanner methodReturn() {
		////使用匿名对象作为方法的返回值
		//Scnner sc =new Scanner(System.in);
//		return sc;
		return new Scanner(System.in);
	}
}
