package Demo27;
  /*
   * String ������ת����صĳ��÷����У�
   * 
   * public char [] toCharArray(); ����ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ�����ķ���ֵ
   * 
   *  public byte[] getBytes(); ��õ�ǰ�ַ����ײ���ֽ�����      ����ao���õ���
   *  
   *  public String replace(CharSequence OldString,ChatSequence newString)
   *  �����г��ֵ����ַ����滻���µ��ַ����������滻֮��Ľ�����ַ���        hsy:����world�ĵ�������滻
   *  ��עCharSequence��˼����˵���Խ����ַ������͡�
   *  ʲôʱ���õ��أ�     ����Ϸ�����ǵ�ʱ��
   *   String lang1=("�˹�");           ϵͳ��������
    	 String lang2=lang1.replace("��", "*");
    	 System.out.println(lang2);   //��*
   *      */
  
public class Demo06 {
  public static void main(String[] args) {
	  //toCharArray();
	  String a1 ="���ᰢ��Ӵ";
	  char [] char1 =a1.toCharArray();
	  System.out.println(char1);
	  System.out.println(char1[0]);  //h     ���Ե��ó�������
 	  System.out.println(char1.length);  //5
	  
      System.out.println("=========");
      //getBytes();
//      byte [] by1=a1.getBytes();
//      System.out.println(by1);
      byte [] by="abc".getBytes();
      for (int i = 0; i < by.length; i++) {
		 System.err.println(by[i]);    //97.98.99  ����ao���õ���
	}
      System.out.println("==========");
              
      // replace(CharSequence OldString,ChatSequence newString)
      String a2 ="���������-zbc";
      String a3=a2.replace("zbc","���������"); //a2����û�䣬����һ���µ�����
      System.out.println(a3);
 
      String lang1=("�˹�");
    	 String lang2=lang1.replace("��", "*");
    	 System.out.println(lang2);
  }
  
  
  
}
