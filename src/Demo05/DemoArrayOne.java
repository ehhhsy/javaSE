package Demo05;

import java.util.Arrays;

public class DemoArrayOne {

	public static void main(String[] args) {
		int [] array =new int [3];
		System.out.println(array);
		System.out.println(array[0]);//0
		System.out.println(array[1]);//0
		System.out.println(array[2]);//0
		System.out.println("===========");		
		array[1]=10;
		array[2]=20;
		System.out.println(array[0]);
		System.out.println(array[1]); //10
		System.out.println(array[2]); //20
		System.out.println("===========");
		int [] array2=new int [2];
		array2[0]=3;
		array2[1]=8;
		System.out.println(Arrays.toString(array2)); //[3, 8]
	}

}
