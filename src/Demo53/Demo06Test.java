package Demo53;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
计算一个字符串中每个字符串出现的次数
    分析:
    1.Scanner获取用户输入的字符
    2.创建Map集合,key是字符串中的字符,value是字符的个数
    3.遍历字符串,获取每一个字符串
    4.使用获取到的字符,去Map集合判断key是否存在
        key存在,通过字符(key),获取到vlue,然后value++
            put(key,value)把新的value存储到Map集合中
        key不存在:
            put(key,1)
     5.遍历Map集合,输出结果
 */
public class Demo06Test {
    public static void main(String[] args) {
        //1.Scanner获取用户输入的字符
        Scanner scanner = new Scanner(System.in);
        System.out.println("weqeqfffweq");
        String s = scanner.next();
        char[] charArray = s.toCharArray();
//        2.创建Map集合,key是字符串中的字符,value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            if (map.containsKey(c)){
//        key存在,通过字符(key),获取到vlue,然后value++
                Integer value = map.get(c);
                value++;
//                put(key,value)把新的value存储到Map集合中
                map.put(c,value);
            }
//        key不存在:
            else{
//                put(key,1)
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    }

