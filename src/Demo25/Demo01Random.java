package Demo25;
 import java.util.Random;
public class Demo01Random {
///
//	 * Random类用来生成随机数字，使用起来也是三个步骤：
//	 *  
//	 * 1.导包
//	 * import java.util.Random;
//	 * 
//	 * 。2.创建
//	 * Random r=new Random();
//	 * 
//	 * 3.使用
//	 *获取一个随机的int数字(范围是int所有范围，有正负两种） int num=r.nextInt（）；
	 //获取一个随机int数字 (参数代表了范围，左闭右开取键） int num =r.nextInt(3);
	//实际上代表的含义是：【0，3} 也代表0~2  ！！！！！！！！！！！
//	 * 
	 
	
		public static void main(String[] args) {
			Random r = new Random();
			for (int i = 0; i < 40; i++) {
				int i1 = r.nextInt(10) + 1;
				System.out.println(i1);
			}
		}
//	  Random r =new Random();
//	    int num =r.nextInt();
//
//	    System.out.println("随机数是"+num);
//
////	    匿名对象+Random
//	    System.out.println("匿名对象+Random实现"+new Random().nextInt());
//
//			System.out.println(new Random().nextInt(3));
//
//
//			Random r1 = new Random(3);  //2020.9.27
//			int i = r.nextInt();
//			System.out.println(i);
//
//			System.out.println("===============");
//
//			Random r2 = new Random();
//			boolean b = r2.nextBoolean();
//			if (b==true){
//				System.out.println("true");
//			}else{
//				System.out.println("false");
//			}
//
//
//		}
}