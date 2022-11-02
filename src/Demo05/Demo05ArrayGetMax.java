package Demo05;
  /*
   * 练习题
   * 求出数组中的最值 （大小） 
   * 
   */
public class Demo05ArrayGetMax {
	public static void main(String[] args) {
		int []array = {13,55,44,656,23,-5233,33,54422,22};
		
		int max =array[0];       //思路点
		int min =array[0];       //思路点
        for(int i=1;i<array.length;i++) {
        	if(max<array[i]) {
             max=array[i];    //最大值
        	}  
        }System.out.println(max);

		System.out.println("---==========20222=================");
		int [] arr={10,23,-557,231,546,746,23,6,3,-53};
		int max2=arr[0];
		int min2=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > max2) {
				max2 = arr[i];
			}
			if (arr[i] < min2) {
				min2 = arr[i];
			}

		}
		System.out.println(max2);
		System.out.println(min2);
		System.out.println("---==========20222=================");

		for(int i=1;i<array.length;++i) {
        	if(min>array.length) {
        		min=array[i];//最小值
        		
        	}
        }
        System.out.println(min);
        int a= array.length;   //2020.6.4
        System.out.println(a);

    System.out.println("=====================");	    //2020.7.20
	int [] arrayHsy = {3,-20,230,600,12};
	int sdaAwe=arrayHsy[0];
	for(int i=1;i<arrayHsy.length;i++) {
		if(arrayHsy[i]>sdaAwe) {
			sdaAwe=arrayHsy[i];
		}
	}System.out.println("2020.7.18 最大的是"+sdaAwe);

		System.out.println("=========================");




		System.out.println(sum(22,10)); //打印调用
	}
	public static int sum(int a,int b){
		if (a>b){
			return a;
		}
		if (a<b){
			return b;
		}
		return 0;
	}




	}
/*int da = array[0]; 步进语句
 * for(int i=1;i<array.length;i++){  //2020.6.4
 *  if(da<array.length){
 *   da=array[i];
 *  }
 *  syso  da
 * }
 */
