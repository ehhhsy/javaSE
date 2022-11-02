package Demo00;
//    用循环求出1-100之间的偶数和  do-while   while  for   2022

public class test_2022 {
    public static void main(String[] args) {
        int sum=0;
        for(int a=0;a<=100;a++){
            if (a%2==0){
                sum+=a;
            }
        }
        System.out.println(sum+"hello!");

    int sum_2=0;
    int b=0;
    do{
       if(b%2==0) {
           sum_2 += b;
       }
        b++;
    }while(b<=100);
    System.out.println(sum_2+"gg");


    int sum_3=0;
    int c=0;
    while(c<=100){
        if(c%2==0){
            sum_3+=c;
        }
        c++;
    }
        System.out.println(sum_3+"hell");
    }
}
