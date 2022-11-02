package Demo07;
/* 面向对象三大特征：封装，继承，多态。
 * 
 * 封装性再java当中的体现：
 * 1.方法就是一种封装
 * 2.关键字private也是一种封装
 * 
 * 封装就是将细节信息隐藏起来，对于外界不可见!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 看图
 * 不知道为什么错了
 * 方法就是一种封装就是旁边有个东西可以收起来，（封装就是将细节信息隐藏起来，对于外界不可见）
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

