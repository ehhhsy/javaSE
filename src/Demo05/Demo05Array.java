package Demo05;
/*������������������������������������������������
 * ����ı��������Ƕ������ÿ��Ԫ�أ�Ĭ�ϴ���ʽ���Ǵ�ӡ���
 */
public class Demo05Array {

	public static void main(String[] args) {
		int [] arrayA = {14,15,64,32,23};
        
		
		for(int i =0;i<arrayA.length;i++) {
			System.out.print(arrayA[i]);
			
		}
	
	/*for (int i=0;i<array.length;i++) {   2020.5.30
		System.out.println(array[i]);
	}
*/
	int [] arrayCssda = {3,1,32,53,13};       //2020.7.20
	 for(int i=0;i<arrayCssda.length;i++) {
		 System.out.print(" "+arrayCssda[i]);

	 }
		 String [] str ={"��","��","˹"};	//2020.9.16
		 for (int i1 = 0; i1 < str.length; i1++) {
			 System.out.println(str[i1]);
		 }
		 String [] s={"��","��","��"};
		 for (int index=0;index<s.length;index++){   //2020.9
 			 System.out.print(s[index]);
		 }

}
}