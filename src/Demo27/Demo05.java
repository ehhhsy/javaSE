package Demo27;
/*
 * �ַ����Ľ�ȡ������
 * 
 * public String substring(int index):��ȡ����λ��һֱ���ַ���ĩβ���������ַ���
 *  
 * public String substring(int begin,int end):��ȡ����begin��һֱ��end�������м���ַ���
 * ��ע��[begin,end) ������ߣ������ұ�
 */
public class  Demo05 {
  public static void main(String[] args) {
	 String str1 ="������̣�����python";
	 String str2 =str1.substring(7); //����7��Ԫ��
	 System.out.println(str2);  //python
	 String str3=str1.substring(2, 4); //����2��4
	 System.out.println(str3);   //���
	 
	 System.out.println(str1); //�ַ����ĳ����������ɱ��
    
	 
      String str4="helloworld";
      System.out.println(str4.substring(4,7));
      
      //��������д�����ַ���������Ȼ��û�иı��
      //�����������ַ�����"hallo","java"
      //strA���б�����ǵ�ֵַ
      //������ֵַ��hello��0x666
      //������ֵַ���java��0x999
      String strA ="Hallo";
      System.out.println(strA); //Hallo
      strA="JAVA";
      System.out.println(strA); //JAVA


      //2020.10.15
      String payth = strA.concat("PAYTH");
      System.out.println(payth); //JAVAPAYTH
      System.out.println(payth.substring(4));
      System.out.println(payth.substring(0,4));
  }
}
