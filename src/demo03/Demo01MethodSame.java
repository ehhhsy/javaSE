package demo03;
//定义一个方法，用来判断两个数字是否相同

public class Demo01MethodSame {
  public static void main (String [] args) {
	  
	  System.out.println(isSame(33,33));
	  System.out.println(isSame(32,33));
	  
	  System.out.println(xiaobai(1+2,2+1));
	  
	  isSame(3.13,3.14);
	  isSame((long)42,(long)3);
	  System.out.println("===============");
	  System.out.println(demo01(3.141525,3.1412322));//false
	  System.out.println("================2022-------------");
	  System.out.println(istrue(3.2,3.1));
  }

	private static boolean demo01(double a,double b) {
  	 	return  a==b;
  }

	public static boolean isSame(int a, int b) {
//	  boolean same;
//	  if (a==b) {
//	    	same =true;
//	    }
//	  else {
//		  same =false;
//	  }
//	  return same; 第一种方法
	  
	  
//	  boolean same= a==b ? true:false; 第二种方法 加 return same;
	  
	  
	  boolean same= a==b; 
//	  第三种方法 加  return same;
//	 
	  return same;
  }
  
  public static boolean xiaobai (int c,int d) {         //2020.5.30
	  //boolean big = c==d ? true:false;
	  //return big;
	  boolean big = c==d;
	  return big;
  }
  
  public static void isSame( double t,double f) {
	  if(t==f) {
		  System.out.println("2020.7.18  一样");     //2020.7.18 
	  }else {
		  System.out.println("错误");
	  }
	 }  
	  public static boolean isSame(long a,long b) {   //2020.7.18 
		  if(a==b) {
			  System.out.println("long a,b true");
			  return true;
		  }else {
			  System.out.println("long a,b false");
			  return false;
		  }
	  }

	  public static boolean istrue(double a,double b ){ //20229.17
		  return a == b;
		}
}
