package demo01;
/*
 *  ǿ������ת�� ����ʽ��                                
 *  �ص㣺������Ҫ����ĸ�ʽ���������Զ���� 
 *  ����ת��int���ͣ�����֮ǰ100Lǰ����ϣ�int��
 *  ��ʽ:��ΧС������ ��ΧС�ı����� =����ΧС�����ͣ� ԭ����Χ������ݣ�
 *  
 *  ע������
 *  1.ǿ��ת�����Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ���������
 *  2.byte/short/char��3�����Ͷ����Է�����ѧ���㣬�确A��
 *  3.byte/short/char��3�����ͷ�����ѧ�����ʱ�򣬶�����������int���ͣ�Ȼ����㡢
 *  4.boolean���Ͳ��ܷ�����������ת��
 */ 
public class Demo2DataType {

	public static void main(String[] args) {

		//�����int���ͣ��ұ���Ĭ�ϵ�long���ͣ����Ҳ�һ��
		//long����int ���������ݷ�Χ��С����
		//���ܷ������Զ�ת��
		//��ʽ:��ΧС������ ��ΧС�ı����� =����ΧС�����ͣ� ԭ����Χ������ݣ�
		int num=(int)100L;
		System.out.println(num);
		
		
//		int num=(int)6000000000L; ����
//		System.out.println(num);
		
		//double ---int ǿ����ת��
		int num3 =(int) 3.99;
		System.out.println(num3);  //3 ��������ʧ��������������

		//������ĵײ����һ�����֣������ƣ�������A������65
		
		char zifu1 ='A';
		System.out.println(zifu1+1); //66, A ������65����
	  
		byte num4 =40;
		byte num5 =50;
		//����byte/short/char��3�����ͷ�����ѧ�����ʱ�򣬶�����������int���ͣ����Ծ�������int��ӣ��ʹ���
//		byte result1 =num4 + num5;
		int result1 =num4 + num5;
		System.out.println(result1);
		
		short num6 =60;
		//byte+short  ---int +int ��int
		//intǿ��ת��Ϊshort��ע��num4��num6û�г���short���ͣ���Ȼ�ᷢ���������
		short result2 =(short)(num4+num6);
		System.out.println(result2);
	}
          
          
}
