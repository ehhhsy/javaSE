package Demo10;
/*
 * 在继承的关系中，‘子类就是一个父类’ 子类可以被当作父类看待
 * 例如父类是员工，子类是讲师，那么‘讲师就是一个员工’ is-a
 * 
 * 格式：定义 父类的格式   （就是一个普通的类定义）
 * public class 父类名称 {
 *     //....
 * }
 * 
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称{
 *   //。。。
 * }
 */
public class Demo02Extends {

	public static void main(String[] args) {
		//创建一个Teacher对象
		Teacher one =new Teacher();
		one.method();
		
		
		//创建另一个助教的对象
		Assistant two= new Assistant();
		two.method();

	}

}
