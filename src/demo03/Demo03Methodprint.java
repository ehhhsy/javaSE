package demo03;
 //定义一个方法，打印指定次数的hallo world
//只是打印，
public class Demo03Methodprint {
	public static void main(String[] args) {
		cs( 4);
		ciii(3); //2020.5.30
		
		cs1(2);
		System.out.println("==================");
		show01(20);
		aaa(3);
	}

	 private static void show01(int a) {
		 for (int i = 1; i <= a; i++) {
			 System.out.println("hallo AI"+i);
		 }
	 }

	 public static void cs( int cisu) {
	    for(int i=0;i<cisu;i++) {
	    	System.out.println("hallo world"+(i+1));
	    }
	   
   }
   
   
   public static int ciii (int h) {
	   
	   for(int i =0;i<=h;i++) {
		   System.out.println("hello,hsy");
	   }
	   return h;
   }
   
   public static int cs1 (int a) {
	   for(int i=1;i<=a;i++) {
		   System.out.println("hallo hsy"+i);    //2020.7.18
	   }
	return a;
   }
   public static void aaa(int a){
	   for (int i = 0; i < a; i++) {
		   System.out.println("hello hsy from 2022  "+a);
	   }
   }
   

}
