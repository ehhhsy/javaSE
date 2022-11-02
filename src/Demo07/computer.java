package Demo07;

import java.util.Arrays;
public class computer {
	 int price;
	   String XH;
	   public static int work(int a,int b) {
		     int count = a+b;
		     return count;
	   }
		public  void stc () {
		    	 int []magicSquare= {1,2,3,4,5};
		    		    System.out.println(Arrays.toString(magicSquare));
				}
		    	 
        public void abc (int price,String XH) {
            	 System.out.println("这台电脑的型号是"+XH+"   价格是"+price);
             }

		 public void dosometing(int [] array){
				 for (int a:array
					  ) {
					 System.out.println(a);
				 }
			 }


		}