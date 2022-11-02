package Demo53;

import java.util.*;
//计算一个字符串中每个字符串出现的次数
public class test_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)){
                Integer i = map.get(c);
                i++;
                map.put(c,i);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}