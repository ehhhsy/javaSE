package test;

import java.util.Random;
import java.util.Scanner;

//Scanner/Random test1
public class test1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String next = sc.next();
//        String next1 = sc.next();
//        System.out.println(next);
//        System.out.println(next1);
        demo01();
    }

    private static void demo01() {
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        System.out.println("«Î ‰»Îint");
        Scanner sc = new Scanner(System.in);

        while (true){
            int nextInt = sc.nextInt();
            if (nextInt>100 || nextInt<0){
                System.out.println("Illegal");
            }else if(nextInt>i){
                System.out.println("¥Û¡À");
            }else if(nextInt<i){
                System.out.println("small");
            }else if(nextInt==i){
                System.out.println("right");
                break;
            }
        }
    }
}
