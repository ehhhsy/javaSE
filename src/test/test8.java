package test;

import java.util.*;

//test1������һ���ַ�����ÿ���ַ������ֵĴ���
public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please scann a string");
        String s = sc.next();
        char[] charsArray = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : charsArray) {
            if (hashMap.containsKey(c)){
                Integer i = hashMap.get(c);
                i++;
                hashMap.put(c,i);
            }else{
                hashMap.put(c,1);
            }
        }
        System.out.println(hashMap);
    }
}
