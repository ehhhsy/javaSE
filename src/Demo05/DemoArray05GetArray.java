package Demo05;
/*
 ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ ��16���ƣ�
 �����ƣ�01;
ʮ���ƣ�0123456789
ʮ�����ƣ�0123456789abcdef

���� ����Ԫ�صĸ�ʽ���������ơ�����ֵ��
����ֵ������һ��int���֣��������鵱��Ԫ�صı���
ע�⣡������������ֵ�Ǵ�0��ʼ�ģ�һֱ�����鳤��-1Ϊֹ
 */
public class DemoArray05GetArray {

	public static void main(String[] args) {
		//ʡ��д��
		int[] array = {10,20,30};
		System.out.println(array); //[I@1f32e575 ��0�ڴ��ַ��ϣֵ��    ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ
		System.out.println(array[0]);//10
		System.out.println(array[1]);//20
		System.out.println(array[2]);//30
	System.out.println("========================");
		    int num =array[1];
		    num+=200;
		    System.out.println(num);
	}

}
