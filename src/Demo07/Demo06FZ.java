package Demo07;
/* �������������������װ���̳У���̬��
 * 
 * ��װ����java���е����֣�
 * 1.��������һ�ַ�װ
 * 2.�ؼ���privateҲ��һ�ַ�װ
 * 
 * ��װ���ǽ�ϸ����Ϣ����������������粻�ɼ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * ��ͼ
 * ��֪��Ϊʲô����
 * ��������һ�ַ�װ�����Ա��и���������������������װ���ǽ�ϸ����Ϣ����������������粻�ɼ���
 */
public class Demo06FZ {
		public static void main(String[] args) {
			int [] array = {1,3,4,5,4,52,92,23};
			int max=getMax(array);
			System.out.println(max);
			System.out.println("===========");
			int [] arr = {1,2,3,4,7,2};
			int max2=gettt(arr);
			System.out.println(max2);
			}
			public static int getMax(int [] zzz) {
				int max=zzz[0];
				for(int i=0;i<zzz.length;i++) {
					if(zzz[i]>max) {
						max=zzz[i];
					}
				}return max;
				
			}
			
			public static int gettt(int [] hsy) {
				int max1=hsy[0];
				for(int i=0;i<hsy.length;i++) {
					if(hsy[i]>max1) {
						max1=hsy[i];
					}
				}
				return max1;
			}
			
}

