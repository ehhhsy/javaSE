package Demo17;
/*
 * super关键字用来访问父类内容，而this关键字用来访问本类内容
 * 用法也有3种
 * 
 * 1.在本类的成员方法中，访问本类的成员变量 
 * 
 * 2.在本类的成员方法中，访问本类的另一个成员方法
 * 
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 * this(..)调用也必须是第一个构造方法的一个语句（super一样）
 */
public class Zi extends Fu{
    int num=10;
	public void method () {
		int num=20;
		System.out.println(num); //局部变量 10
		//1.在本类的成员方法中，访问本类的成员变量 
		System.out.println(this.num); //本类的成员变量 20
	    System.out.println(super.num);//父类的成员变量   30
	}
	
	public void method1() {
		//2.在本类的成员方法中，访问本类的另一个成员方法
		this.method();
		System.out.println(num);
	}
	public void print() {
		//2.在本类的成员方法中，访问本类的另一个成员方法
		this.method();
		System.out.println(123);
	}
	
	public Zi() {
		super();
		System.out.println("无参构造方法");
		
	}
	public Zi(int a) {
//		3.在本类的构造方法中，访问本类的另一个构造方法
		this();
		System.out.println(a+"有参构造方法");
	}
}
