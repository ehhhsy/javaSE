package Demo24;
/*
 * ��������ı�׼��ʽ��
 * ������ ������ =new �����ƣ�����
 * 
 * �����������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ�����
 * ע����������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ڴ���һ���¶���
 */
public class Demo01Anonymous {
      public static void main(String[] args) {
		Person one =new Person();
		
		one.name="zbc";
		one.show("������");//�������ҽ�  zbc
		
		//��������
		new Person().name="���忪"; 
		new Person().show("zbc");//zbc�ҽ�  null
		// ע����������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ڴ���һ���¶���
		
	}
  }
