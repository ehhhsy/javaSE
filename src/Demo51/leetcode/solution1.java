package Demo51.leetcode;
//https://leetcode.cn/problems/remove-duplicate-letters/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class solution1 {
    //����һ���ַ��� s ������ȥ���ַ������ظ�����ĸ��ʹ��ÿ����ĸֻ����һ�Ρ��豣֤ ���ؽ�����ֵ�����С��Ҫ���ܴ��������ַ������λ�ã���
    public static void main(String[] args) {
        System.out.println(        demo01("abbc"));
    }

    private static String demo01(String s) {
        char[] charArray = s.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : charArray) {
            arrayList.add(c);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            Character arry_getIndex = arrayList.get(i);
            for (int j = 1; j < arrayList.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (arry_getIndex == arrayList.get(j)) {
                    arrayList.remove(i);
//                    arrayList.remove(j);
                }
            }
        }
        String final_s="";
        for (Character character : arrayList) {
            final_s+=character;
        }
        return final_s;
    }

}






        
//        for (int i = 0; i < charArray.length; i++) {
//            if(charArray[i].)
//        }
//    }
//}
    //int [] nums={1,2,3};  int target
//    public static  int[] twoSum(int[] nums, int target) {
//        int two_sum = 0;
//        int[] arr = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            two_sum = nums[i] + nums[i + 1];    //0+1 ,1+2
//            if (two_sum == target) {
//            arr[0]=i;
//            arr[1]=i+1;
//            }
//        }
//        return arr;
//    }




