package Demo07;

import java.util.Arrays;

/*
  ������̣�����Ҫʵ��һ�����ܵ�ʱ��ÿ�����岽�趼Ҫ������Ϊ����ϸ����ÿһ��ϸ��(�Լ��ɣ�
 ������󣺵���Ҫʵ�ֵ�һ�����ܵ�ʱ�򣬲����ľ���Ĳ��裬�����ҵ�һ�����иù��ܵ��ˣ��������������˸ɣ�
 */
public class Demo01PrintlnAarray {

	public static void main(String[] args) {
		int [] array= {10,20,30,40,50};
		//Ҫ���ӡ��ʽΪ�� [10,20,30,40,50]
		//ʹ�á�������̡���ÿ������ϸ�ڶ�Ҫ������Ϊ��
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==array.length - 1) {
				System.out.print(array[i]+"]");
				}else {
					System.out.print(array[i]+",");
				
			}
		}
		//ʹ���������
		//��һ��jdk�ṩ�����ǵ�Arrays��
		//������һ��toString��������ֱ�Ӱ���������Ҫ�ĸ�ʽ���ַ���
             System.out.println("========================");
             System.out.println(Arrays.toString(array));

             //2020.9.18
	}

}
