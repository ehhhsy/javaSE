package Demo6Array;
  /*     default �����break����ʡ�ԣ����ǲ��Ƽ���
   * ԭ����Ϊʡ����break��default������case�Ļ����ͻ����ִ��ֱ��break��
   * switch���ʹ�õ�ע�����
   * 1�����case�������ֵ�������ظ�  ������case1   ����������case1��
   * 2��switch����С���ŵ���ֻ���������������ͣ���������������������
   *                �����������ͣ�byte/short/char/int
   *                �����������ͣ�string�ַ�����enumö��
   * 3.switch�����Ժ���ǰ��˳����Եߵ�������break��仹����ʡ�ԡ�����������������������������������
   *  ��ƥ�䵽��һ��case������ִ�У�ֱ��������break�����������Ϊֹ������������������������������������������
   */
public class Demo07Switch2 {
	public static void main(String[] args) {
		int num=2;
		switch(num) {
		case 1:                                   
		System.out.println("�Ǿ���case1��");
		break;
		case 2:                                       //ǰ��˳����Եߵ� case2 -case4
			System.out.println("�Ǿ���case2��");
			//break;         break����ʡ�ԣ�ʡ�ԵĻ���Ҫ�ҵ���һ��break���ܷ��أ�������                        �Ǿ���case2��  �Ǿ���case4��   
		case 4:
			System.out.println("�Ǿ���case4��");
			break;
		default:
			System.out.println("�Ǿ���default��");    //default---case5
			break;
		case 5:
		System.out.println("�Ǿ���case5��");
		break;
}
	
	
	String aa = "1334";     //2020.6.4
	switch(aa) {
	case "1334":
		System.out.println("������ȷ");
		break;
	
	default:
		System.out.println("�������");
	 break;
	}
          
	int a=3;
	switch (a) {
	case 1:
		           int b=1;
        break;
	case 2:
		           int b1=2;                  //2020.7.20
		break;
	case 3:
		           int b2=3;
		break;
	default:
		           int b3=3;
		break;
	}
}
}