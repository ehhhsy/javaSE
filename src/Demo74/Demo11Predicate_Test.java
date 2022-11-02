package Demo74;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/20:08
 * @Description: test:集合信息筛选
 */
public class Demo11Predicate_Test {
    public static void main(String[] args) {
    String [] arr={"dlyb,women","glnz,women","mezh,man","zly,women"};
        ArrayList<String> arrayList = getRightMessage(arr, s -> s.split(",")[0].length() == 4, s -> s.split(",")[1].contains("women"));
        System.out.println(arrayList);
    }

    /**
     * @description
     * @param s:
     * @param predicate_1:
     * @param predicate_2:
     * @return ArrayList<String>
     * @date 2022/10/17 20:34
     */
    protected static ArrayList<String> getRightMessage(String []s, Predicate<String> predicate_1, Predicate<String> predicate_2){
        //定义一个ArrayList集合，存储过滤的信息
        ArrayList<String> arrayList = new ArrayList<>();
        //遍历数组,获取数组中的每一个信息
        for (String message : s) {
            boolean b = predicate_1.and(predicate_2).test(message);

        //对得到的boolean值进行判断
        if (b){
            //条件成立，把信息存储到ArrayList集合
            arrayList.add(message);
        }
        }
        return arrayList;
    }
}
