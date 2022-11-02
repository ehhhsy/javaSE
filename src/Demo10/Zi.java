package Demo10;

public class Zi  extends Fu{
   int numzi=20;
   int num=200; 
   
   //因为本类当中有num，所以这里用的是本类的num，不会向上找
   public void methodZi() {
	   System.out.println(num);
   }
}
