
package Demo23;
import java.util.Scanner;  
//1.��������������������������
/*
 * Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ���������
 * 
 * �������͵�һ��ʹ�ò��裺
 * 1.import ��·��.�����ƣ�
 *   �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
 *   ֻ����java��lang���µĵ����ݲ���Ҫ����������������Ҫimport����
 *   ������˵����һ��String ��������String����java��lang.string ���Բ���import
 *   
 * 2.����
 * ������ ������ =new �����ƣ�����
 * ��עSystem��in  ����Ӽ�������  
 * 
 * 3.ʹ��
 * ����������Ա������������
 * 
 * ��ȡ���������һ��int���֣�int num = sc.nextInt();
  ��ȡ���������һ��String�ַ�����String str = sc.next();
  
  С��ʾ����Ļ����Ķ����ַ���
   next();ֻ��ԭ�ⲻ��������string
   nextInt();���ǽ���Ļ���ַ���24��д24��ת��Ϊ����Ҫ��int����24
 */

public class Demo01Scanner {
	public static void main(String[] args) {
		System.out.println("please input a String");
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.next();// next();ֻ��ԭ�ⲻ��������string
		System.out.println("please input a int");
		int i = sc.nextInt();//���ǽ���Ļ���ַ���24��д24��ת��Ϊ����Ҫ��int����24
		System.out.println(sc1);
		System.out.println(i);
	}
//    public static void main(String[] args) {
////		2.����      ��עSystem��in  ����Ӽ�������   �������췽����
//    	Scanner sc =new Scanner(System.in);
//    	//3. ��ȡ���������һ��int����
//    	System.out.println("������һ��int����");
//    	int num=sc.nextInt();
//    	System.out.println(num+"��");
//
//    	//��ȡ���������һ��String�ַ���
//    	System.out.println("������һ������");
//    	String str =sc.next();
//    	switch(str) {
//    	case "����ʯ":
//    		System.out.println("��÷����");
//    		break;
//    	case "�Ÿ�":
//    		System.out.println("���Ǹߡ�");
//    		break;
//    	case "���":
//    		System.out.println("����®ɽ�ٲ�");
//    		break;
//    	case "������":
//    		System.out.println("��һ��÷����ź��������");
//    		break;
//        default:
//        	System.out.println("ʲô��û��");
//        	//2020.9.27
//    	}
    	
	}
