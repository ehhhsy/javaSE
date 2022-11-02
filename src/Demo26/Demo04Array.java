package Demo26;

import java.lang.reflect.Array;
import java.util.ArrayList;
////遍历集合
public class Demo04Array {
	public static void main(String[] args) {
       ArrayList<Character> one =new ArrayList<Character>();
//     one.add('黄');
//     one.add('施');
//     one.add('宇');
     //遍历集合
     for (int i = 0; i < one.size(); i++) { 
		 System.out.println(one.get(i));
	}
     System.out.println(one);

        System.out.println("===========================");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(22);
        arrayList.add(33);
        for (int i = 0; i < arrayList.size(); i++) {            //2020.9.27
            if (i==2){
                arrayList.remove(2);
            }else{
                System.out.println(arrayList.get(i));
            }
        }
    }

}
