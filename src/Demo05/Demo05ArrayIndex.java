package Demo05;
/*
 * �����������Ŵ�0��ʼ��һֱ��"����ĳ���-1"Ϊֹ
 * 
 * �����������Ԫ�ص�ʱ��������Ų������ڣ���ô�ᷢ��
 * ��������Խ���쳣
 * ArrayIndexOutOfBoundsException
 *  
 *  ԭ���������д����
 *  ������޸Ĵ��ڵ���ȷ�������
 */
public class Demo05ArrayIndex {

	public static void main(String[] args) {
	       int[] array= {15,25,35};
	       System.out.println(array[0]);//15
	       System.out.println(array[1]);//25
	       System.out.println(array[2]);//35 
	       
//	       System.out.println(array[3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	   	//at Demo05.Demo05ArrayIndex.main(Demo05ArrayIndex.java:21)

	
          float [] array2 = {3.1F,232F,23.1F,22.4F}; //2020.7.20
           System.out.println(array2[1]); //232           
           System.out.println(array2[0]);

		System.out.println("==========================");	//2020.9.13
           String [] ldz={"lu","jun","wen"};
		System.out.println(ldz[0]);
		System.out.println(ldz[1]);
		System.out.println(ldz[2]);


           
	}
}