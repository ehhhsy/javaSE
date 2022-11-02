package Demo15;

public class Zi  extends Fu{
	 public Zi() {   //无参构造方法
		 //super(); 默认赠送  ，在调用父类无参构造方法，解开错误，因为
		 //必须是子类构造方法的第一个语句。
		 super(2);  
		  System.out.println("子类无参构造方法执行");
	  }
	 public void method() {
//		 super();  错误写法！只有子类构造方法，才能调用父类方法
	 }
}
