package Demo25;

import java.util.Random;
/*
 * //��ȡһ�����int���� (���������˷�Χ������ҿ�ȡ���� int num =r.nextInt(3);
	//ʵ���ϴ���ĺ����ǣ���0��3} Ҳ����0~2  ����������������������
 */
public class Demo02Random {
  public static void main(String[] args) {
	Random r =new Random();
	
	for(int i=1;i<100;i++) {
		//��������+random��ʹ��
//		System.out.println(new Random().nextInt(11));
		int num =r.nextInt(11);
		System.out.println(num);

		System.out.println("===================");
		for (int j = 0; j < 10; j++) {
			System.out.println(new Random().nextInt(10)+1);   //1-10
		}
	}
			}
}
