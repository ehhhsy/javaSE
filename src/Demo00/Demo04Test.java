package Demo00;

/*
 * ��ѭ�����1-100֮���ż����  do-while   while  for  
 * 
 * ����ݼ� alt + shift +R һ�������б������� @@@@@@@@@@@@@@@@
 * 
 * ˼·��
 * 1.��Ȼ��Χ�Ѿ�ȷ����1-100֮�䣬
 * 2.�ܹ���100�����֣������������ֶ����ã�������ż�������ã��жϡ�if���ż����num%2==0}
 * 3.��Ҫһ�������������ۼӲ���������Ǯ�ޡ�  ���ڳ�ʼ���λ��
 */
public class Demo04Test {
	public static void main(String[] args) {
		int i=0;
		int sum=0;    //����Ǯ�ޡ�
		do {                    //do-while
			if(i%2==0) {
				 sum+=i;
			}
		i++;
		}while(i<=100);
		System.out.println(sum);
            System.out.println("===========");
            
            int a=0;
            int he=0;  //����Ǯ�ޡ�
            while (a<=100) {                 //while
            	if(a%2==0) {
            		he+=a;
            	}
            	a++;
            }
            System.out.println(he);
            
            
            System.out.println("===========");
            int hhh=0; //����Ǯ�ޡ�
            for(int b=0;b<=100;b++) {          //for
            	if(b% 2==0) {
            		hhh+=b;
            	}
            }	System.out.println(hhh);
            System.out.println("==============");
            /*
             * 2020.7.18
             */
            int sum1=0;
            for(int i1=1;i1<=100;i1++) {             //for2020.7.18
            	sum1+=i1;
            }
            System.out.println(sum1+"  2020.7.18");
           
            int sum2=0;
            int i2=1;
            while(i2<=100) {           //do-while2020.7.18
             	if(i2%2==0) {
            		sum2+=i2;
            	   }
            i2++;}
            System.out.println(sum2+"  2020.7.18");//2020.7.18
            
            
            int sum4=0;
            int i3=1;
            do {
            	sum4+=i3;
            	i3++;
            }while(i3<=100);
            System.out.println(sum4+"  2020.7.18");
        System.out.println("===========");
        int s=0;
        int hsy=0;
        while (s<=100){                     //2020.9.12 while 1-100
            if (s%2==0){
                hsy+=s;
            }
            s++; }
        System.out.println(hsy);
        System.out.println("===========");
        int hsy1=0;
        for (int i4=0;i4<=100;i4++){
            if (i4%2==0){
                hsy1+=i4;
            }
        }
        System.out.println(hsy1);      //2020.9.12 for 1-100


        System.out.println("===========");
        int s1=0;
        int hsy3=0;
        do {
            if (s1%2==0){
                hsy3+=s1;
            }
            s1++;
        }while (s1<=100);
        System.out.println(hsy3);



    }

}
