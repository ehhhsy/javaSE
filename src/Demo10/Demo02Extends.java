package Demo10;
/*
 * �ڼ̳еĹ�ϵ�У����������һ�����࡯ ������Ա��������࿴��
 * ���縸����Ա���������ǽ�ʦ����ô����ʦ����һ��Ա���� is-a
 * 
 * ��ʽ������ ����ĸ�ʽ   ������һ����ͨ���ඨ�壩
 * public class �������� {
 *     //....
 * }
 * 
 * ��������ĸ�ʽ��
 * public class �������� extends ��������{
 *   //������
 * }
 */
public class Demo02Extends {

	public static void main(String[] args) {
		//����һ��Teacher����
		Teacher one =new Teacher();
		one.method();
		
		
		//������һ�����̵Ķ���
		Assistant two= new Assistant();
		two.method();

	}

}
