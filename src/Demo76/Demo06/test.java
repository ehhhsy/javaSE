package Demo76.Demo06;

/**
 * @Author: hsy
 * @Date: 2022/10/19/19:07
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        int[] intArr_1 = method(5, (lenght) -> {
            int[] arr = new int[lenght];
            return arr;
        });
        System.out.println(intArr_1.length);

        /**
         * @description 使用方法调用优化数组构造器
         * 已知创建的就是int [] 类型数组
         * 数组的长度也是已知的
         */
        int[] intArr_2= method(3, int[]::new);
        System.out.println(intArr_2.length);
    }
    //定义一个方法，方法传递数组长度,函数式接口，才能使用lambda接口
    protected static int[] method(int lenght,ArrayBuilder arrayBuilder){
            return   arrayBuilder.buildArr(lenght);
    }
}
