package Demo26;
/*
 * 题目创建一个数组，用来存储3个person对象
 * 
 * 对象数组有一个缺点：
 * 一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {

	public static void main(String[] args) {
        Person[] array =new Person[3]; 
		System.out.println(array[0]); //null
		
		Person one =new Person("迪丽热巴",20);
		Person two =new Person("古力娜扎",19);
		Person three =new Person("马儿咋哈",40);
		
	
//				System.out.println(array[0]=new Person("迪丽热巴",20));
	  
		
		//将one当中的地址值复制到数组的0号元素位置
		array[0]=one;
		array[1]=two;
		array[2]=three;
		System.out.println(array[0]); //@28a418fc
		System.out.println(array[1]); //@5305068a
		System.out.println(array[2]); //@1f32e575
		
		System.out.println(array[1].getName());
		//1号元素是two的地址，所以是古力娜扎

		
		Person person =array[1];
	}
	
	

}
