package Demo25;
 import java.util.Random;
public class Demo01Random {
///
//	 * Random����������������֣�ʹ������Ҳ���������裺
//	 *  
//	 * 1.����
//	 * import java.util.Random;
//	 * 
//	 * ��2.����
//	 * Random r=new Random();
//	 * 
//	 * 3.ʹ��
//	 *��ȡһ�������int����(��Χ��int���з�Χ�����������֣� int num=r.nextInt������
	 //��ȡһ�����int���� (���������˷�Χ������ҿ�ȡ���� int num =r.nextInt(3);
	//ʵ���ϴ���ĺ����ǣ���0��3} Ҳ����0~2  ����������������������
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
//	    System.out.println("�������"+num);
//
////	    ��������+Random
//	    System.out.println("��������+Randomʵ��"+new Random().nextInt());
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