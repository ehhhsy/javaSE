package Demo10;
/*
 * zi.java   fu.java
 * 
 * �� ������ļ̳й�ϵ���У������Ա�����������򴴽��������ʱ�����������ַ�ʽ
 * 
 * 1.  ֱ��ͨ�����������ʳ�Ա����
 *     �Ⱥ���� ��˭      ��������˭��û����������           �������
 * 2.  ���ͨ����Ա�������ʳ�Ա����
 *  ��������Զ����Ա������������Զ����Ա�������ڸ���д�ķ�������Ϊ������num�������õ��Ǳ����num��
 *  ��ͼ������!!!!!!!!!!!!!!!!!!!!!!!!!!
 *  ��Ҫ������������˭�����������ģ�����������˭��û����������
 */
public class Demo01ExtendsField {

	public static void main(String[] args) {
		Fu one = new Fu(); //����������� 
		System.out.println(one.numfu);
		//ֻ��ʹ�ø���Ķ�����û�����������
		System.out.println("=========================");
		Zi two =new Zi();
		System.out.println(two.numfu+two.numzi);//two.numfu+two.numzi
	
		//����û�У���������  �ҵ������numfu
		System.out.println(two.numfu);
		
		System.out.println(two.numzi);
		System.out.println("=========================");
		
		//�Ⱥ���� ��˭      ��������˭��û����������
		System.out.println(two.num);  //�������࣬200
		System.out.println(one.num);  //���ȸ��� 100
		
		//������û�У��ͱ��뱨��
		//System.out.println(zi.ABC);
		
		//�������������ģ����������࣬û����������
		two.methodZi();  //200
		
		
		//����ڸ��൱�ж���ģ������ڸ���
		two.methodFu();
	}

}
