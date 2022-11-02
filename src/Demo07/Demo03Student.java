package Demo07;
/*
 * 通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
 * 
 * 1.导包：也就是指出需要的类，在什么位置。
 * import 包名称      类名称;
 * import Demo07 Demo02Student;
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写。
 * 
 * 2.创建，格式：
 * 类名称 对象名  =new 类名称（）；
 * Demo02student stu = new Demo02student（）；
 * 
 * 3.使用，分为两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名（）  有参数的还要写（参数）
 * （也就是，想用谁，就用对象名点谁）
 * 
 * 注意事项：
 * 如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo03Student {
       
	public static void main(String [] args) {
		//1.导包
		//我需要使用Demo02student类，和我自己的Demo03student类位于同一个包下（Demo07）所以【省略】导包语句
		
	
	     //2.创建.格式：
		// 类名称 对象名  =new 类名称（）；
		//根据Demo02student类，创建一个名为stu的对象
		Demo02student stu =new Demo02student();
		
		//3.使用其中的成员变量
		//对象名.成员变量名
		System.out.println(stu.name);  //null  string的默认值
        System.out.println(stu.age);  //0      int的默认值
       
        
        //4.使用对象的成员方法，格式
        //对象名.成员方法名（）；
    		  stu.eat();
    		  stu.study();
    		  stu.sleep();
}
}