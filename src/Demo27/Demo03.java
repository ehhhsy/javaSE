package Demo27;
/*
 * ==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ���ַ��������ݡ��Ƚϣ�����ʹ�á�����������
 * public boolean equals(object obj);       �����������κζ���
 * ֻ�в�����һ���ַ�������������ͬ�ĲŻ��true�����򷵻�false
 * ��ע���κζ�������object���н���
 * 
 * ע��ʵ�֣�
 * equals�������жԳ��ԣ�Ҳ����a.equals��b����b.equals��a��Ч����һ����
 * ����Ƚ�˫��һ��������"Hello"����һ������s1���Ƽ��ѳ����ַ���д��ǰ��
 * �Ƽ���"Hello".equals(s3)   ���Ƽ�s3.equals("Hello")
 * 
 * public boolean equalsIgnoreCase(String str):���Դ�Сд��ֱ�ӽ������ݵıȽ�
 *  public boolean equals(object obj);      ���ִ�Сд���������ݵıȽ�
 */
public class Demo03 {
   public static void main(String[] args) {
	 String s1="Hello";
	 String s2="Hello";
	 char [] a1= {'H','e','l','l','o'};
   	   String s3= new String(a1);
   	   //����Ҫ���ݵıȽ�
   	   System.out.println(s1.equals(s2)); //true
   	   System.out.println(s1.equals(s3)); //true
   	   System.out.println(s3.equals("Hello")); //true ���Ƽ�
   	   System.out.println("Hello".equals(s3));  //true  �Ƽ�
   	   
   	   String s4="hello";
   	   System.out.println(s2.equals(s4));//false  ��һ��
   	   System.out.println("================");
   	   String s5=null;
   	   System.out.println("Hello".equals(s5)); //false
//   	   System.out.println(s5.equals("Hello")); //������ָ���쳣 NullPointerException

   	   System.out.println("=================");
       String s6="java";
       String s7="JAVA";
       System.out.println(s6.equals(s7)); //false
       System.out.println(s6.equalsIgnoreCase(s7)); //tue
        
       //ֻ��Ӣ����ĸ���ִ�Сд������������
       System.out.println("abc-123".equalsIgnoreCase("abc-Ҽ23"));//�����Ȼ��false

	   String anm="11";
	   System.out.println("һһ".equals(anm)); //false
	   String ammm="AWDWDAG";
	   System.out.println("awdwdag".equalsIgnoreCase(ammm));  //true
   }
}
