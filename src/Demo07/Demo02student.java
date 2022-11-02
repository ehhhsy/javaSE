package Demo07;
/*！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 *定义一个类，用来模拟【学生】事物，其中就有两个组成部分：
 *
 *属性：（是什么）
 *  姓名
 *  年龄
 *行为（能做什么）
 *  吃饭
 *  睡觉
 *  学习
 *  
 *  对应到java的类当中：
 *    成员变量（属性）
 *    String name；姓名
 *    int age；   年龄
 *    成员方法（行为）
 *   public  void eat（）{} //吃饭      注意：成员方法没有static关键字
 *   public  void sleep（）{} //睡觉
 *   public  void study（）{} //学习
 *   
 *   注意事项：
 *   1.成员变量是【直接写在类当中】的，【在方法外边】
 *   2.成员方法不要写static关键字
 */
public class Demo02student {
  
	  //成员变量
	  String name;
	  int age;//姓名
	  public void eat() {  //成员方法
		  System.out.println("吃饭");
	  }
		  public void sleep() {  //成员方法
			  System.out.println("睡觉");
		  }
			  public void study() {  //成员方法
				  System.out.println("学习");
			  }
		  
			  
	  }


