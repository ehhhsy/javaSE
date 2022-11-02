package Demo05;
/*
 直接打印数组名称，得到的是数组对应的，内存地址哈希值 （16进制）
 二进制：01;
十进制：0123456789
十六进制：0123456789abcdef

访问 数组元素的格式：数组名称【索引值】
索引值，就是一个int数字，代表数组当中元素的编码
注意！！！！：索引值是从0开始的，一直到数组长度-1为止
 */
public class DemoArray05GetArray {

	public static void main(String[] args) {
		//省略写法
		int[] array = {10,20,30};
		System.out.println(array); //[I@1f32e575 （0内存地址哈希值）    直接打印数组名称，得到的是数组对应的，内存地址哈希值
		System.out.println(array[0]);//10
		System.out.println(array[1]);//20
		System.out.println(array[2]);//30
	System.out.println("========================");
		    int num =array[1];
		    num+=200;
		    System.out.println(num);
	}

}
