package Demo05;
/*
 ���飺��һ������������ͬʱ��Ŷ������ֵ������������࣬����ֻ�ܴ�ŵ��������ݿ��Դ�Ŷ��
 �ص㣺
 1.������һ����������
 2.�����еĶ�����ݣ����ͱ���ͳһ
 3.����ĳ����ڳ������ڼ䲻���Ըı�
 
 ����ĳ�ʼ�������ڴ��д���һ�����飬���������и���һЩĬ��ֵ
 ���ֳ����ĳ�ʼ����ʽ��
 1.��̬��ʼ����ָ�����ȣ�
 2.��̬��ʼ����ָ�����ݣ�
 
 ��̬��ʼ�������ʽ��
 �������� ���� �������� =new �������� �����鳤�ȡ���
 
 �������壺
 ��ߵ��������ͣ�Ҳ�������б��ֵ����ݣ�ȫ����ͳһ��ʲô����
 ��ߵ������ţ���������һ������
 ����������ƣ�������ȡ����
 �ұߵ�new ������������Ķ���
 �ұ��������ͣ��������ߵ��������ͱ���һ��
 �ұ������ŵĳ��ȣ�Ҳ���������У����׿��Ա��ֶ��ٸ����ݣ���һ��int����

  */
public class Demo5Array {
	public static void main(String[] args) {
		int score1 =100;
		int score2 =98;
		int score3=99;
		System.out.println(score3);
		//����һ�����飬����Ϊ300��int����
		int[] arrayA =new int[300];
		
		//����һ�����飬����Ϊ10��double����
		double [] arrayB =new double [10];
		
		//����һ�����飬����Ϊ5��String����
		String [] arrayC =new String [5];
		
		long []  arrayd ={1,3,4,5};

          float [] a= {2,2,3.1f,21};

          String [] str ={"l","j"};
		for (String abc:str
			 ) {
			System.out.println(abc);
		}
		System.out.println("-----------2022=================="); //2022.9
		double[] doubles = new double[4];
		doubles[0]=0;
		doubles[1]=1;
		doubles[2]=2;
		doubles[3]=3;
		for (double d:doubles
			 ) {
			System.out.println(d);
		}
	}
}