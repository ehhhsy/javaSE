package demo01;
  /*  
   * һԪ�������ֻҪһ�����ݲſ��Խ��в����������  ���� ȡ���� ����++  �Լ�--
   * ��Ԫ�������ֻҪ�������ݲſ��Խ��в����������  ����  �ӷ�+  ����-
   * ��Ԫ�������ֻҪ�������ݲſ��Խ��в����������  
   * 
   * ��ʽ��
   * �������� ������ = �����жϣ� ���ʽA�����ʽB
   * 
   * ���̣�
   * �����ж������Ƿ������
   *   �������Ϊtrue ����ô���ʽa��ֵ��ֵ�����ı���
   *   �������Ϊfalse ����ô���ʽb��ֵ��ֵ�����ı���
   *   
   *   ע�����
   *   1.����ͬʱ��֤���ʽA�����ʽB��������ߵ��������͵�Ҫ��                 int result=3>4 ? 2.5:10;(���󣡣�
   *   2.��Ԫ�����������뱻ʹ�� , Ҫô�͸�ֵ��         a>b ?a:b������д����
   */  
public class Demo9Operator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		//�������� ������ = �����жϣ� ���ʽA�����ʽB
		//�ж�a>b�Ƿ������
		int sum =a>b ?a:b;
		System.out.println(sum);
		 System.out.println("============");
		int w=33; 
		boolean q = w>3 ? true :false;
		 System.out.println(q);         //true
       
		 System.out.println("============");
		 //��ȷд�� ����Ԫ�����������뱻ʹ�� ����Ҳ��ʹ�õ�һ��
		 System.out.println(a>b ?a:b);
		 System.out.println(3>4 ? 10.1:3); //3.0
		System.out.println("============");
		int aaa=20;
		int bbb=30;
		int ab=aaa<bbb?aaa:bbb;
		System.out.println(ab); //20     		2020.9.13
		boolean abab=aaa<bbb?true:false;
		System.out.println(abab); //true
		System.out.println(aaa>bbb?a:b);//20

		System.out.println("new one 2022");  //2022.9.15
		int x=50;
		int y=30;
		System.out.println(x<y ? (x=y):(y=x));
		System.out.println(x);
		System.out.println(y);
	}

}
