package Demo27;
/*
 * �ָ��ַ����ķ�����
 * public String [] split(String regex):���ղ����Ĺ��򣬽��ַ����зֳ����ɷ�
 *   split�����Ĳ�����ʵ��һ����������ʽ��,���ѧϰ��
 *   ����ע�⣺�������Ӣ�ĵľ��" .", ���У�����Ҫд ��//.�� 
 *      �����㣩. ���������ֵ�ʱ����������ʽ�������⺬��
 *  */
public class Demo05StringSplit {
 public static void main(String[] args) { 
	 String s1 = "aaa,bbb,ccc,dd,e";
	 String [] array =s1.split(",");  //����,�з�
	 for (int i = 0; i < array.length; i++) {  
		System.out.println(array[i]);    
	}
	 System.out.println("===============");
	 
	 String s2 ="zzz bbb ccc d ax";
	 String[] array2 =s2.split(" ");   ///���տո��з�
	 for (int i = 0; i < array2.length; i++) {
		 System.out.println(array2[i]);
	}
	 System.out.println("===============");
	 String s3 ="zzz.bbb.ccc.d.ax";//���ﲻ�ø�
	 String[] array3 =s3.split("//.");   ///����д//.
	 for (int i = 0; i < array3.length; i++) {
		 System.out.println(array3[i]);
	}
}
}
