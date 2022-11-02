package Demo28;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
    题目：
    请将一个随机的字符串数组中的所有字符串升序排列，并倒序打印
   */
public class Demo06ArrayS {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(5)+1;
            array[i] += i1;
        }
//        System.out.println(Arrays.toString(array));           //2020.11.11
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }
         /* Random  ra =new Random();
           String [] array =new String[5];
          for (int i = 0; i < 5; i++) {    //自己的玩法，还可以
              int in= ra.nextInt(5)+1;
             array[i]+=in;
          }
          Arrays.sort(array);
          //因为是String类型所以初始值是null
          //[null1, null3, null3, null4, null5]
          System.out.println(Arrays.toString(array));

          //null5 null5 null4 null3 null2
          for (int i = array.length-1; i >=0 ; i--) {
              System.out.print(array[i]+" ");
          }*/

//       //老师的玩法
//        String str ="sdsad23ka12lSDLAdaz";
//         //升序：sort
//          // 必须是一个数组，才能用Arrays.sort方法
//          //String--》数组，用toCharArray
//        char[] chars =str.toCharArray();
//         Arrays.sort(chars);
//          System.out.println(Arrays.toString(chars));
////          正序：chars.fori   倒序chars.forr !!!!!!!!!!!!!!!!!!!!
//         //倒序  这个我会
//          for (int i = chars.length-1; i >= 0; i--) {
//              System.out.println(chars[i]);
//          }
//
//      }
//     int[] array = new int[3];
//        int[] ints = print(array);
//    }
//public static int[] print( int[] arr){
//            for (int i = 0; i < 3; i++) {
//                arr[i] = new Random().nextInt(10) + 1; //1-10
//
//            }
//        Arrays.sort(arr);
//    for (int i = arr.length - 1; i >=0 ;i--) {
//        System.out.println(arr[i]);
//    }
//    return arr;
//    }
//}

    }
}