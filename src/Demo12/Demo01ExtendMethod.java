package Demo12;
/*��Ա��������
 * �ڸ�����ļ̳й�ϵ���У������������ �����ʳ�Ա�����Ĺ���
 * �����Ķ�����˭��new ����˭������������˭�����û���������� 
 * 
 * ע�����
 * �����ǳ�Ա�������ǳ�Ա���������û�о������Ҹ��࣬���Բ�������������
 * 
 * ��д ��override��
 * ����ڼ̳й�ϵ��(��Ҫ���м̳У�������������һ���������б�Ҳһ����
 * ��д��override��:����������һ���������б���Ҳһ���� �����ǣ�������д����д��
    ���أ�overload): ����������һ���������б�����һ����
    
    ���� �ĸ�����д�ص㣺��������������������������෽����new����˭���õľ���˭
 */
public class Demo01ExtendMethod {
	public static void main(String[] args) {
		Fu fu =new Fu();
		fu.methodFu();
       System.out.println("===============");
		Zi zi =new  Zi();
		zi.methodZi();
		
		//���û���������ң���������û������������ 
		zi.methodFu();
	    System.out.println("===============");
	    //��������new����������������������෽��
		zi.method(); //new ���� Zi ����������zi
	}

}