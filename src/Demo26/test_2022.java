package Demo26;
//��Ŀ:��һ���󼯺ϴ���20�������,Ȼ��ɸѡ���е�ż��Ԫ��,����С���ϵ���
import java.util.ArrayList;
import java.util.Random;

public class test_2022 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int i1 = random.nextInt(50) + 1;
            list.add(i1);
        }
        System.out.println(list);
        ArrayList dou_list = select_list(list);
        System.out.println(dou_list);
    }

    public static ArrayList select_list(ArrayList<Integer> list) {
        ArrayList<Integer> dou_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                dou_list.add(list.get(i));
            }
        }
        return dou_list;
    }
}


