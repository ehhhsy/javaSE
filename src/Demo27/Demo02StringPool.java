package Demo27;

public class Demo02StringPool {
/*
 * �ַ��������أ�������ֱ��д�ϵ�˫�����ַ����������ַ����������С�String s1=  "abc";
 * ֻ��˫����ֱ��д���ڳ����new�Ļ��͸���û��ϵ�ˣ�new�Ĳ��ڳ���
 *  
 *  ���ڻ���������˵��==�ǽ�����ֵ�ıȽϡ�
  ��������������˵��==�ǽ��С���ֵַ�ıȽϡ��ıȽ�
  
  �������⣺
  1.��������������˵��==���е��ǵ�ֵַ�ıȽ�
  2.˫����ֱ��д���ַ����ڳ����ص��У�new�Ĳ��ڳص���
 *  
 */
	public static void main(String[] args) {
          String s1=  "abc";  
          String s2= "abc";
          
          char [] charArray= {'a','b','c'};
          String s3= new String(charArray);
          
//          ��ͼ
          System.out.println(s1==s2);  //true ˵��s1��s2��ַһ��
          System.out.println(s1==s3);  //false
          System.out.println(s2==s3);  //false
          
          System.out.println("==============");
          boolean a1=s1.equals(s3);
          System.out.println(a1);
          boolean a2 =s2.equalsIgnoreCase(s3);
          System.out.println(a2);
          
	}

}
