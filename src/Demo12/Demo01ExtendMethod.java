package Demo12;
/*成员方法重名
 * 在父子类的继承关系当中，创建子类对象 ，访问成员方法的规则：
 * 创建的对象是谁（new 的是谁），就优先用谁，如果没有则向上找 
 * 
 * 注意事项：
 * 无论是成员方法还是成员变量，如果没有就向上找父类，绝对不会向下找子类
 * 
 * 重写 （override）
 * 概念：在继承关系中(你要先有继承），方法的名称一样，参数列表也一样。
 * 重写（override）:方法的名称一样，参数列表【也一样】 （覆盖，覆盖重写，覆写）
    重载（overload): 方法的名称一样，参数列表【不一样】
    
    方法 的覆盖重写特点：创建的是子类对象，则优先用子类方法。new的是谁，用的就是谁
 */
public class Demo01ExtendMethod {
	public static void main(String[] args) {
		Fu fu =new Fu();
		fu.methodFu();
       System.out.println("===============");
		Zi zi =new  Zi();
		zi.methodZi();
		
		//如果没有则向上找，这条子类没有所以向上找 
		zi.methodFu();
	    System.out.println("===============");
	    //创建的是new了子类对象，所以优先用子类方法
		zi.method(); //new 的是 Zi ，就优先用zi
	}

}
