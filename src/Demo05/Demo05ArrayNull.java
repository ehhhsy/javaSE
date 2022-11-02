package Demo05;
/*空指针异常
 * 所有的引用 类型变量，都可以赋值成为一个null变量，但是代表什么都没有
 * 
 * 数组必须进行new初始化才能使用其中的元素。
 * 如果只是赋值了一个null。没有进行new创建
 * 那就会发生：
 * 空指针异常 NullPointerException
 * 
 * 原因：忘了new   
 * 解决：加上new
 */
public class Demo05ArrayNull {
	public static void main(String[] args) {
		int [] array =null;
           // array =new int [3];  可以解开这个解决问题
		System.out.println(array[0]);  //错误
		//Exception in thread "main" java.lang.NullPointerException
		//at Demo05.Demo05ArrayNull.main(Demo05ArrayNull.java:18)

		//2020.9.16

	}

}
