package Demo23.test_2022;

import java.util.Scanner;

public class scanner_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a String");
        String intput_s = sc.next();
        System.out.println("please input a int");
        int input_i = sc.nextInt();
        System.out.println("the string is "+intput_s);
        System.out.println("the int is "+input_i);


    }
}
