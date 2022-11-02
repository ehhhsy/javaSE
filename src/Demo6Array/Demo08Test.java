package Demo6Array;

import java.util.Arrays;

/**
 * @Author: hsy
 * @Date: 2022/11/02/16:40
 * @Description:
 * 创建这个文件的时候，就变成绿色了
 *
 * 测试此java文件是否能上传到github里面
 */
public class Demo08Test {
    public static void main(String[] args) {
        //还是要象征性写一些东西的。。。
        //些啥呢？
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,10};
        System.arraycopy(arr1,3,arr2,3,2);
        Arrays.stream(arr2).forEach(System.out::print); // 67845
    }
}
