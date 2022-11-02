package Demo16;
 /*
  * super关键字的用法有三种：
  * 1.子类的成员方法中，访问父类的成员变量 
  * 
  * 2子类的成员方法中，访问父类的成员方法
  * 
  *  3.子类的构造方法中，访问父类的构造方法
  */
public class Zi extends Fu {
  int num =10;
  
  public void methodZi() {
	  System.out.println(num);
	  System.out.println(super.num); //父类中的num
//	  1.子类的成员方法中，访问父类的成员变量 
	 } 
	  public void method() {
		  super.method();//父类方法
//		  2子类的成员方法中，访问父类的成员方法 
	    	System.out.println("子类方法");
	    }
	   public Zi() {
		   super();
		   System.out.println("子类构造方法");   
	   }
  
}
