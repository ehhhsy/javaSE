package demo01;
/*优先级问题！！小括号是优先执行的
 * 四则运算 当中的加号“+”有常见的三种用法：
 * 
 * 1.对于数值来说，那就是加法。
 * 2.对于字符char类型来说，在计算之前会被【int】类型，然后计算（ASCII unicode）
 * 
 * 3.（字符串连接）对于字符串String（首字母大写，不是关键字）来说，加号代表字符串链接操作。
 * 任何数据类型和字符串进行连接的时候，结果都会变成字符串
 */
public class Demo04Plus {

	public static void main(String[] args) {
		String str1="hello";
		System.out.println(str1); //hello
		
		//System.out.println(str1+"world");
		System.out.println("hello"+"world"); //hello world
		
		String str2="java";
		//String+int--->String
		System.out.println(str2+20);//java20  任何数据类型和字符串进行连接的时候，结果都会变成字符串
		
		//优先级问题！！
		//String+int+int
		//string+int
		//String
             System.out.println(str2+20+30);//string2030
           //String+（int+int）
     		//string+int
     		//String
             System.out.println(str2+(20+30));//String50
             
             String a= "sd";
             System.out.println(a+23+6);  //2020.7.18
             System.out.println(a+"的"+(323+32));

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
