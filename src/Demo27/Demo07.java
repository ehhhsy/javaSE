package Demo27;
 /*��ϰ1
  * ��Ŀ��
  * ����һ��������������{1��2��3}����ָ����ʽƴ�ӳ�һ���ַ�����
  * ��ʽ��[word1#world2#world3]
  * 
  * ������
  * 1.����׼��һ��int[]���飬������1,2,3
  * 2.����һ������.�������������ַ���    
  * ��Ҫ��
  * ����ֵ���ͣ�String
  �������ƣ����
  �����б�int []
  3.��ʽ��[word1#world2#world3]
  �õ�forѭ�����ַ���ƴ�ӣ�ÿ������Ԫ��֮ǰ����һ��word�������ָ�ʹ��#������һ���ǲ������һ��
  4.���÷���
  */
public class Demo07 {
  public static void main(String[] args) {
	  int [] array = {1,2,3,4};
	  
	  String s2 =Pj(array);
	  System.out.println(s2);
	 }
     public static String Pj (int[] array1) {
    	String s1 = "[";
    	for (int i = 0; i < array1.length; i++) {
			if(i==array1.length-1) {
				 s1 +="world"+array1[i]+"]";
		}else {
		      s1 +="world"+array1[i]+"#";
		}
     }
		return s1;
}

}