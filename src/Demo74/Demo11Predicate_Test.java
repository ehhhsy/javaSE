package Demo74;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/20:08
 * @Description: test:������Ϣɸѡ
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
        //����һ��ArrayList���ϣ��洢���˵���Ϣ
        ArrayList<String> arrayList = new ArrayList<>();
        //��������,��ȡ�����е�ÿһ����Ϣ
        for (String message : s) {
            boolean b = predicate_1.and(predicate_2).test(message);

        //�Եõ���booleanֵ�����ж�
        if (b){
            //��������������Ϣ�洢��ArrayList����
            arrayList.add(message);
        }
        }
        return arrayList;
    }
}
