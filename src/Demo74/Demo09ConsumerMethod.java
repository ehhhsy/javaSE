package Demo74;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/17/18:39
 * @Description: Ĭ�Ϸ���andThen  ��������Consumer�ӿ� �ټ������ѣ�˭дǰ��˭������
 */
public class Demo09ConsumerMethod {
    public static void main(String[] args) {
        //���÷��������ݲ���
        demo01("hahaHHH",(o1)->{
            System.out.println(o1.toUpperCase(Locale.ROOT));
        },(o1)->{
            System.out.println(o1.toLowerCase(Locale.ROOT));
        });
        //����demo02����
        demo02("abcdEFggg",(o1)->{
            System.out.println(o1.toUpperCase(Locale.ROOT));
        },(o1)->{
            System.out.println(o1.toLowerCase(Locale.ROOT));
        });
    }



    /**
     * @description Demo01()
     * @param s:
     * @param consumer_1:
     * @param consumer_2:
     * @return void
     * @author hsy
     * @date 2022/10/17 18:49
     */
    public static void demo01(String s, Consumer<String> consumer_1,Consumer<String> consumer_2){
        consumer_1.accept(s);
        consumer_2.accept(s);
    }
    /**
     * @description: ʹ��andThen��������
     * @param s:
     * @param con1:
     * @param con2:
     * @return void
     * @author hsy
     * @date 2022/10/17 18:56
     */
        private static  void demo02(String s, Consumer<String> con1,Consumer<String> con2) {
        //˭��ǰ��������˭
        con1.andThen(con2).accept(s);
    }
}
