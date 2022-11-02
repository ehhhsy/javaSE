package Demo74;

import java.util.function.Function;

/**
 * @Author: hsy
 * @Date: 2022/10/17/20:40
 * @Description: java.util.function.function<T R> ʹ�� function�ӿڰ� String ת��Ϊ Integer
 */
public class Demo12Function_1 {
    public static void main(String[] args) {
        Integer integer = parse("10255", (s) -> {
            int i = Integer.parseInt(s);
            return i;
        });
        System.out.println(integer);
        System.out.println(integer+20);

    }
    /**
     * @description ����һ��������String ת��Ϊ Integer
     * @param s: �ַ���
     * @param function: function�ӿ�
     * @return Integer
     * @date 2022/10/17 20:42
     */
    protected static Integer parse(String s, Function<String,Integer> function){
        return function.apply(s);
    }
}
