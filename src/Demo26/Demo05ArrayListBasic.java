package Demo26;

import java.util.ArrayList;
/*
 * 基本类型              包装类 (引用类型,包装类都位于java.lang包下)
 * byte      Byte
 * short     Short
  * int      Integer   [特殊]
 * long      Long
 * float     Float
 * double    Double
 * boolean   Boolean
 * char      Character  [特殊]
 * 除了Intteger,character,其他都是首字母变大写
 * 
 * 从jdk1.5开始,支持自动装箱,自动拆箱
 * 自动拆箱:基本类型--->包装类型
 * 自动装箱:包装类型--->基本类型
 */
public class Demo05ArrayListBasic {
 public static void main(String[] args) {
	ArrayList<String> one =new ArrayList<>();   	//创建一个ArrayList<String>对象

	//基本类型的数据没有地址值,所以存储不了
	//泛型只能是引用类型,不能是基本类型
//	ArrayList<int> three =new ArrayList<>();
	ArrayList<Integer> three =new ArrayList<>();    //创建一个int包装对象
	three.add(233);
	three.add(244);
	three.add(255);              //往Integer类数组里装对象
	System.out.println(three);   //输入数组
	int num =three.get(2);       //get方法，拿到 255
	System.out.println("第2号元素是"+num);//255
	 three.remove(2);
	 System.out.println(three);
	
 }
}
