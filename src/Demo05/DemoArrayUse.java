package Demo05;
/*
 * 使用动态初始化数组，其中的元素将会自动拥有一个默认值。规则如下
 * 如果是整数类型，那么默认为0；
 * 如果是浮点数类型，那么默认为0.0；
 * 如果是字符类型，那么默认为'/u0000'
 * 如果是boolean类型，那么默认为false；
 * 如果是引用类型，那么默认为null；
 * 
 * 小注意事项：
 * 静态初始化其实也有默认值的过程，只不过 系统马上把默认值替换成为了大括号当中的具体数值
 *   就是说：int[] array ={1,3,4}   先是默认值，{0，0，0}，然后系统马上替换成1，3，4
 */
public class DemoArrayUse {

	public static void main(String[] args) {
	 int [] array =new int[3];
	 System.out.println(array);//内存地址值
	 System.out.println(array[0]); //0
	 System.out.println(array[1]);//0
	 System.out.println(array[2]);//0
	 System.out.println("=======");
	
	  //将数据123赋值交给数组array当中的1号元素
	 array[1] =123;
	 System.out.println(array);//内存地址值
	 System.out.println(array[0]); //0
	 System.out.println(array[1]);//123
	 System.out.println(array[2]);//0
	 
	 
	 char [] a=new char[3];
	 System.out.println(a[3]);
	 
	 

	}

}
