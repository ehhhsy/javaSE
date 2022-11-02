package demo02;
/*
 * 定义一个方法：a+b；
 * 
 */
 
public class DEmo02MethodDefine {
  public static void main (String[] args) {
	  int number =sum(30,12);              //打印调用
	  number+=200;                    
	  System.out.println(number);
	  
	  
	  System.out.println(sumzz(2,3));
	  
	  System.out.println("=========");
	  sum1(13,5);
	  
	  System.out.println("2020.7.19 int "+sum2(1,3));

	  int i = sum2(2, 7);
	  System.out.println(i);
  }
  public static int sum (int a, int b) {
	
	  int result = a+b;
	  return result;
  }
 
  
  
  public static int sumzz (int a,int b) {   //2020.5.30
	  int sum =a+b;
	  return sum;
  }
   public static void sum1(int a1,int b1) {   //2020.7.19  
	      System.out.println("2020.7.19 void "+a1+b1);
   }
   public static int sum2(int a2,int b2) {
	   return a2+b2;
   }

   public static int sum2022(int a,int b){
  	return a+b;
   }
}
