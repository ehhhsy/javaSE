package Demo05;
/*��ָ���쳣
 * ���е����� ���ͱ����������Ը�ֵ��Ϊһ��null���������Ǵ���ʲô��û��
 * 
 * ����������new��ʼ������ʹ�����е�Ԫ�ء�
 * ���ֻ�Ǹ�ֵ��һ��null��û�н���new����
 * �Ǿͻᷢ����
 * ��ָ���쳣 NullPointerException
 * 
 * ԭ������new   
 * ���������new
 */
public class Demo05ArrayNull {
	public static void main(String[] args) {
		int [] array =null;
           // array =new int [3];  ���Խ⿪����������
		System.out.println(array[0]);  //����
		//Exception in thread "main" java.lang.NullPointerException
		//at Demo05.Demo05ArrayNull.main(Demo05ArrayNull.java:18)

		//2020.9.16

	}

}
