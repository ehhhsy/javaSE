package Demo25;

import java.util.Random;
import java.util.Scanner;

//根据int变量n的值，来获取随机数字，范围是{1，n} 可以取到1也可以娶到n
public class test2022 {
    public static void main(String[] args) {
        gust_number();
    }
    public static void gust_number() {
        Random r = new Random();
        int random = r.nextInt(100) + 1;
        while (true) {
            System.out.println("============================");
            System.out.println("Random number 0-100,please insert a number");
            Scanner sc = new Scanner(System.in);
            int sc_int = sc.nextInt();
            if(sc_int> random){
                System.out.println("too big"+"\n");
            }else if(sc_int<random){
                System.out.println("too small"+"\n");
            }else{
                System.out.println("this is right,the number is !!!"+sc_int +"\n");
                break;
            }
        }
    }
}
