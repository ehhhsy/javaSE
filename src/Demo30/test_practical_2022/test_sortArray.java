package Demo30.test_practical_2022;

import java.util.Arrays;
import java.util.Random;

public class test_sortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            int next = random.nextInt(700);
            arr[i]=next;
        }
        Arrays.sort(arr);
        String s = Arrays.toString(arr);

        String replace1 = s.replace("[", "")
                 .replace("]","").replace(" ", "");
        char[] chars = s.toCharArray();
        System.out.println(replace1);
        //        for (int i=chars.length-1;i>0;i--){
//            System.out.print(chars[i]+" ");
//        }
    }
}
