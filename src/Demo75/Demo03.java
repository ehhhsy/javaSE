package Demo75;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: hsy
 * @Date: 2022/10/18/19:40
 * @Description:
 */
public class Demo03 {
    public static void main(String[] args) {
         //��listת��Ϊstream��
        ArrayList<String> arrayList = new ArrayList<>();
        Stream<String> stringStream_1 = arrayList.stream();
        //��Setת��Ϊstream��
        HashSet<String> hashSet = new HashSet<>();
        Stream<String> stringStream_2 = hashSet.stream();

        HashMap<String, String> hashMap = new HashMap<>();
        //1.��ȡkey     ��keyת��Ϊstream��
        Set<String> keySet = hashMap.keySet();
        //2.��keySetת��Ϊstream��
        Stream<String> stringStream_3 = keySet.stream();

        //1.��ȡֵ     ��valueת��stream��
        Collection<String> values = hashMap.values();
        //2.�Ѵ����value��Collection ת��Ϊstream��
        Stream<String> stringStream_4 = values.stream();

        //1.��ȡkey,��value  ��key��valueת��Ϊstream��
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
         //��key,valueת��Ϊstream��
            Stream<Map.Entry<String, String>> stream = entrySet.stream();
        }

        //������ת��Ϊstream��
        Stream<Integer> integerStream_1 = Stream.of(1, 2, 3, 4, 5);
        int [] arr={2,3,4,5,6};
        Stream<int[]> integerStream_2 = Stream.of(arr);
        String [] arr2={"hhh","xixi","lala"};
        Stream<String> stringStream = Stream.of(arr2);
    }
}
