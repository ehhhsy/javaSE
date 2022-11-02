package demo02;
 /*
  * 打印指定次数10次hallo word
  */
public class Demo03MetherParam {

	public static void main(String[] args) {
		chengfa(23,33);    //没有输出
		wucans();
       
		cS(4);
		System.out.println("this is ===========");
		println2022(2);
		println2022(8);
	}
	public static void  chengfa(int a,int b) {
		int sum =a*b;
		System.out.println(sum);       
		
	}
    public static void wucans() {
    	for(int i=1; i<=10;i++) {
    		System.out.println("hello word"+i);
    	}
    }
     
    public static int cS(int h) {
    	for(int i=1;i<=h;i++) {
    		System.out.println("2020.7.19 指定次数的 "+"hello world"+i);
    	}
    	return h;
    }
    public static void println2022(int num){
		if (num<=5){
			for (int i = 0; i < num; i++) {
				System.out.println("num<=5 2022");
			}
		}
			if (num>5){
				for (int i = 0; i < num; i++) {
					System.out.println("num>5 2022");
				}

		}
	}
 }
