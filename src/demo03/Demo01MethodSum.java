package demo03;
//  ����һ���������1-100�ĺ�ֵ
public class Demo01MethodSum {

	public static void main (String [] args) {
//		 System.out.println("1-100�ĺ�ֵ"+add()); ��ӡ����
//		int num =add();
		System.out.println(add()); //
		
		big();   //2020.5.30
		System.out.println("================");
		sum1();
		System.out.println(sum2(100));   //ָ��1-a��������
		System.out.println("================");
		System.out.println(demo01());  //5050
	}

	private static int demo01() {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		return sum;
	}

	public static int add () {
		int sum=0;
		for(int i =1 ;i<=100 ;i++) {
			
			  sum+=i;
			  
		}
		 return sum;
		 
		 /*
		  * for(int i =1 ;i<=100 ;i+=2) {   //��1-100������
			  sum+=i;
		}
		 return sum;
		 */
	}
	public static int big () {
		int sum11 =0;
		for (int i=1;i<=100;i++) {
			 sum11+=i;
		}
		System.out.println(sum11);
		return sum11;
	}
	
	
	public static void sum1() {
		int sum1=0;
	   for(int i=1;i<=100;i++) {   //2020.7.18  void 
		   sum1+=i;
	   }
	   System.out.println(sum1);
	}
	
	
	public static int sum2(int a) {
		int sum2=0;
		for(int i=1;i<=a;i+=2) {    //ָ��1-a��������   2020.7.18 int
			sum2+=i;
		}
		return sum2;
	}
}
