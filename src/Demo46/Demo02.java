package Demo46;

import java.util.ArrayList;

/*【重点】
  【自动装箱与自动拆箱】：
  基本类型的数据和包装类之间可以自动的相互转换
  jdk1.5之后出现的新特性
 */
public class Demo02 {
    public static void main(String[] args) {

        //举例子
        //自动装箱 相当于 Integer one =new Integer（1);
        Integer one=1;


        //自动拆箱 one是包装类，无参直接参与运算，可以自动转换
        one=one+4;//【重点】，这里one是Integer
        System.out.println(one);

        //ArrayList集合无法直接存储整数，倒是可以存储Integer包装类
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1); //自动装箱 list.add（new Integer(1))

        //           =list.get（0）.inValue();
        int intone  = list.get(0); //自动拆箱，get得到的是Integer类型，自动转化成int

    }
}
