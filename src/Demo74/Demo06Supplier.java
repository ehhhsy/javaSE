package Demo74;

import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/20:52
 * @Description: ���õĺ���ʽ�ӿ� -- Supplier   java.until.function�� �ṩ�˺ܶຯ��ʽ�ӿ�
 */
public class Demo06Supplier {
    public static void main(String[] args) {
        //Supplier��һ������ʽ�ӿ�,����ʹ��lambda���ʽ
        String string = getString(() -> {
            //����һ���ַ���������;
            return "����";
        });
        System.out.println(string);

        //�Ż�
        String string_2 = getString(() -> "С��2");
        System.out.println(string_2);
    }
    /**
     * @description ����һ������,������������һ��Supplier�ӿڷ�����<String>,ִ��get()�����ͻ᷵��һ��String
     * @param supplier:
     * @return String
     * @author hsy
     * @date 2022/10/15 21:00
     */
    protected static String getString(Supplier<String> supplier){
        return supplier.get();
    }
}
