package Demo17;
/*
 * super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ�������
 * �÷�Ҳ��3��
 * 
 * 1.�ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա���� 
 * 
 * 2.�ڱ���ĳ�Ա�����У����ʱ������һ����Ա����
 * 
 * 3.�ڱ���Ĺ��췽���У����ʱ������һ�����췽��
 * this(..)����Ҳ�����ǵ�һ�����췽����һ����䣨superһ����
 */
public class Zi extends Fu{
    int num=10;
	public void method () {
		int num=20;
		System.out.println(num); //�ֲ����� 10
		//1.�ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա���� 
		System.out.println(this.num); //����ĳ�Ա���� 20
	    System.out.println(super.num);//����ĳ�Ա����   30
	}
	
	public void method1() {
		//2.�ڱ���ĳ�Ա�����У����ʱ������һ����Ա����
		this.method();
		System.out.println(num);
	}
	public void print() {
		//2.�ڱ���ĳ�Ա�����У����ʱ������һ����Ա����
		this.method();
		System.out.println(123);
	}
	
	public Zi() {
		super();
		System.out.println("�޲ι��췽��");
		
	}
	public Zi(int a) {
//		3.�ڱ���Ĺ��췽���У����ʱ������һ�����췽��
		this();
		System.out.println(a+"�вι��췽��");
	}
}
