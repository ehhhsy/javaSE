package Demo26;

import java.util.ArrayList;
/*
 * ��������              ��װ�� (��������,��װ�඼λ��java.lang����)
 * byte      Byte
 * short     Short
  * int      Integer   [����]
 * long      Long
 * float     Float
 * double    Double
 * boolean   Boolean
 * char      Character  [����]
 * ����Intteger,character,������������ĸ���д
 * 
 * ��jdk1.5��ʼ,֧���Զ�װ��,�Զ�����
 * �Զ�����:��������--->��װ����
 * �Զ�װ��:��װ����--->��������
 */
public class Demo05ArrayListBasic {
 public static void main(String[] args) {
	ArrayList<String> one =new ArrayList<>();   	//����һ��ArrayList<String>����

	//�������͵�����û�е�ֵַ,���Դ洢����
	//����ֻ������������,�����ǻ�������
//	ArrayList<int> three =new ArrayList<>();
	ArrayList<Integer> three =new ArrayList<>();    //����һ��int��װ����
	three.add(233);
	three.add(244);
	three.add(255);              //��Integer��������װ����
	System.out.println(three);   //��������
	int num =three.get(2);       //get�������õ� 255
	System.out.println("��2��Ԫ����"+num);//255
	 three.remove(2);
	 System.out.println(three);
	
 }
}
