 //��Ŀ�������������������int���֣��������
/*
 * ˼·��
 * 1.��Ȼ��Ҫ�������룬��ô����Scanner
 * 2.Scanner���������裺������������ʹ��
 * 3.��Ҫ�����������֣�����Ҫ��������nextInt����
 * 4.�õ����������֣�����Ҫ����һ��
 * 5.�������ӡ���
 */
package Demo23;
  import java.util.Scanner;
  //1.����
public class Demo02ScannerTest {
public static void main(String[] args) {
//	2.����
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ��");
	int num = sc.nextInt();
	System.out.println("������ڶ���");
	int num2 = sc.nextInt();
	System.out.println("�������������"+(num+num2));
//	System.out.println("�������������"+num+num2);���󣬱���ַ������

	System.out.println("====================");
	System.out.println("������������������");
	System.out.println(new Scanner(System.in).nextInt()+new Scanner(System.in).nextInt());
}
}
