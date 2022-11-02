package Demo74;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/21:06
 * @Description: 练习:用Supplier接口求数组的最大值,通过lambda表达式求出int数组的最大值
 */
public class Demo07SupplierTest {
    public static void main(String[] args) {
        int [] arr={10,23,22,11,2,6,30};
        int max = getArrMax(() -> {
            //获取数组的最大值,并返回
            int first = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (first <= arr[i]) {
                    first = arr[i];
                }
            }
            return first;
        });
        System.out.println(max);
    }
    protected static int getArrMax(Supplier<Integer> supplier){
        return supplier.get();
    }
}
