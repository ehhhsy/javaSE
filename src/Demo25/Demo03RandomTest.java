package Demo25;
/*
 * ��ĿҪ��
 * ����int����n��ֵ������ȡ������֣���Χ��{1��n} ����ȡ��1Ҳ����Ȣ��n
 * 
 * ˼·��
 * 1.��һ��int����n�����⸳ֵ
 * 2.Ҫʹ��Random���������裬������������ʹ��
 * 3.���д��10����ô����0-9   
 * 4.��ӡ�����
 */
import java.util.Random;

public class Demo03RandomTest {

	public static void main(String[] args) {
		int n=5;
		Random one =new Random();
	    for (int i = 0; i < 10; i++) {
	    	//������Χ��[0,n��������+1֮���ɡ�1.n+1����Ҳ���ǡ�1��n��
		   int result=one.nextInt(n)+1;
		   System.out.println(result);
		}


		System.out.println("===================");
	    print(5);


	}
	public static void print(int n){			//��ӡ10��ָ����1-n�������
		for (int i = 0; i < 10; i++) {
			System.out.println(new Random().nextInt(n)+1); //2020.9.28
		}
	}
}
