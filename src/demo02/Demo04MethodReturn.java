package demo02;

public class Demo04MethodReturn {

	public static void main(String[] args) {
	int number=sum(3,4);
	System.out.println("sum的结果是"+number);
	
	printSum(4,6);
	}
     public static int sum(int a,int b) {
    	 
    	 return a+b;
     }
     public static void  printSum(int a,int b) {
    	 
    	 System.out.println("printSum的结果是"+a+b); //与string字符串相加，则变成字符串
     }
}
