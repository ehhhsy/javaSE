package demo01;
/* ע�����
 * 1��һ��������в�ͬ�������ݣ���ô����������������ͷ�Χ�������       ����������
 * 2.byte short char �������ж����ȱ��int������
 * 
 * ������������ض��Ĳ��������磺+
 * ���ʽ�����������������ʽ�ӽ������ʽ������20+5 ������a+b
 * 
 * ���������  �Ӽ��˳�
 * ȡģ��ȡ������ �� %
 * ֻ�Ƕ������ĳ�����˵��ȡģ������������������塣
 * ������ /���� =�̡�������
 * 
 * ����һ��������int...���ı��ʽ��˵�������õ������������������������������������ֻ���̣���������
 * 
 *
 */
public class Demo03simple {

	public static void main(String[] args) {
		 //��������֮����Խ�����ѧ����
		System.out.println(33+2); //35
      
		//��������֮��Ҳ���Խ�����ѧ����
		int a=20;
		int b=30;
		System.out.println(a+b); //50
		
		//�����ͳ���֮����Ի��ʹ��
		System.out.println(a*10); //200
		
		
		int x =10;
		int y= 3;
		int result1 =x/y;
		System.out.println(result1); //3
		
		int result2 =x%y;
		System.out.println(result2); //ģ 1
		
		//int +double ����������  double +double������double
		//һ��������в�ͬ�������ݣ���ô����������������ͷ�Χ�������   
		double result3=x+2.3;
		System.out.println(result3);   //12.3

		System.out.println("this is hsy form 2022---==---");
		int t1=30;
		int t2=4;
		System.out.println(t1+t2); //34
		System.out.println(t2-t1); //-26
		System.out.println(t1/t2); //7
		System.out.println(t1%t2); //2
		
	}

}
