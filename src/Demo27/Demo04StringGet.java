package Demo27;
/*
 * String�������ȡ��صĳ��÷����У�
 * 
 * public int length();����ȡ�ַ������к��е��ַ�����==�õ��ַ����ĳ��ȣ�
 * 
 * public String concat(String str):����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ���
 * 
 * public char chaAt(int index):��ȡָ��λ�õĵ����ַ�����������0��ʼ��
 * 
 * public int indexOf(String str):���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ
 *   ����˵��
 *   �����ַ����� 123�����ַ�����123456���״γ��־���1��1��λ���ڱ��ַ�����0��Ԫ��
 *   �����ַ����� 3�����ַ�����123456���״γ��־���3��3��λ���ڱ��ַ�����2��Ԫ��
 *   �����ַ����� 35�����ַ�����123456��35û�г�����123456�����ԣ�����-1   
 */
public class Demo04StringGet {
	public static void main(String[] args) {
  String str="123456";	
  String str1="äɮ";
  String str2 ="-����";
  String str4="123";
  String str5="35";
  String str6="3";
  
	// public int length(); ��ȡ����
//  int num=str1.length();
//  System.out.println(num);  //2
//		System.out.println("===============");
  //public String concat(String str): ƴ���ַ���
//  String str3=str1.concat(str2);
//  System.out.println(str3); // äɮ-����    ��һ���µ��ַ���
//  System.out.println(str1); // äɮ      ԭ�ⲻ��     �ַ��������������ɱ䡣  ���ص㡿
//  System.out.println(str2); // -����    ԭ�ⲻ��      �ַ��������������ɱ䡣  ���ص㡿
//  System.out.println("===============");
  
  //public char chaAt(int index):��ȡָ��λ�õĵ����ַ���
// char ch = str.charAt(3);
// System.out.println(ch);  //4
//
// System.out.println("===============");
//  int a= str.indexOf(str4);
//  System.out.println("123�ַ���������λ����"+a);
//  int b =str.indexOf(str5);
//  System.out.println("35�ַ���������λ����"+b);
//  int c =str.indexOf(str6);
//  System.out.println(("3�ַ���������λ����"+c));
  //Ҳ��������  
  //int d =str.indexOf("23");
  //System.out.println("helloworld".indexOf("123"));   ��С�ص㡿
//
//	  System.out.println("=========");  //2020.7.29
//	 System.out.println("c".concat("f"));  //concat���� �����ַ���
//	 String a1 = "2334333";
//     char a2=a1.charAt(3);                //charAt ȡ��Ԫ��
//     System.out.println(a2);
//     System.out.println(a1.length());      //length ��ó���
//
//     System.out.println(a1.indexOf("434"));  //-1
//     System.out.println(a1.indexOf("433"));  //3   //indexOf�״γ��ֵ�����λ�ã�

	//2020.10.15
    String l="13231324Gfsf";
        System.out.println(l.length()); //12
    String ln="�ȸ�";
        System.out.println(ln.concat(l)); //�ȸ�13231324Gfsf

        System.out.println(l.charAt(11));//f

        System.out.println(l.toLowerCase().indexOf("g"));
}
}