package demo01;
/*���ȼ����⣡��С����������ִ�е�
 * �������� ���еļӺš�+���г����������÷���
 * 
 * 1.������ֵ��˵���Ǿ��Ǽӷ���
 * 2.�����ַ�char������˵���ڼ���֮ǰ�ᱻ��int�����ͣ�Ȼ����㣨ASCII unicode��
 * 
 * 3.���ַ������ӣ������ַ���String������ĸ��д�����ǹؼ��֣���˵���ӺŴ����ַ������Ӳ�����
 * �κ��������ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���
 */
public class Demo04Plus {

	public static void main(String[] args) {
		String str1="hello";
		System.out.println(str1); //hello
		
		//System.out.println(str1+"world");
		System.out.println("hello"+"world"); //hello world
		
		String str2="java";
		//String+int--->String
		System.out.println(str2+20);//java20  �κ��������ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���
		
		//���ȼ����⣡��
		//String+int+int
		//string+int
		//String
             System.out.println(str2+20+30);//string2030
           //String+��int+int��
     		//string+int
     		//String
             System.out.println(str2+(20+30));//String50
             
             String a= "sd";
             System.out.println(a+23+6);  //2020.7.18
             System.out.println(a+"��"+(323+32));

		System.out.println("this is new my 2022"); //2022.9.15

			String s2="str22s";
			if (s2.length()<4){
				System.out.println(s2.length());
				System.out.println(s2+"4444");
			}else{
				System.out.println(s2.length());
				System.out.println(s2+"6666");
			}
	}

       
}
