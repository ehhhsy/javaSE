package Demo10;
/*
 * zi.java   fu.java
 * 
 * 在 父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式
 * 
 * 1.  直接通过子类对象访问成员变量
 *     等号左边 是谁      就优先用谁，没有则向上找           看下面↓
 * 2.  间接通过成员方法访问成员变量
 *  （子类可以定义成员方法，父类可以定义成员方法，在父类写的方法，因为父类有num，所以用的是本类的num）
 *  看图！！！!!!!!!!!!!!!!!!!!!!!!!!!!!
 *  就要看方法‘属于谁’（定义在哪），就优先用谁，没有则向上找
 */
public class Demo01ExtendsField {

	public static void main(String[] args) {
		Fu one = new Fu(); //创建父类对象 
		System.out.println(one.numfu);
		//只能使用父类的东西，没有子类的内容
		System.out.println("=========================");
		Zi two =new Zi();
		System.out.println(two.numfu+two.numzi);//two.numfu+two.numzi
	
		//子类没有，就向上找  找到父类的numfu
		System.out.println(two.numfu);
		
		System.out.println(two.numzi);
		System.out.println("=========================");
		
		//等号左边 是谁      就优先用谁，没有则向上找
		System.out.println(two.num);  //优先子类，200
		System.out.println(one.num);  //优先父类 100
		
		//到处都没有，就编译报错
		//System.out.println(zi.ABC);
		
		//这个方法是子类的，优先用子类，没有再向上找
		two.methodZi();  //200
		
		
		//这个在父类当中定义的，是属于父类
		two.methodFu();
	}

}
