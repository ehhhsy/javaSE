package demo02;

public class Demo04MethodReturn {

	public static void main(String[] args) {
	int number=sum(3,4);
	System.out.println("sum�Ľ����"+number);
	
	printSum(4,6);
	}
     public static int sum(int a,int b) {
    	 
    	 return a+b;
     }
     public static void  printSum(int a,int b) {
    	 
    	 System.out.println("printSum�Ľ����"+a+b); //��string�ַ�����ӣ������ַ���
     }
}
