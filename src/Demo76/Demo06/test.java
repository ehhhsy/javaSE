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
         * @description ʹ�÷��������Ż����鹹����
         * ��֪�����ľ���int [] ��������
         * ����ĳ���Ҳ����֪��
         */
        int[] intArr_2= method(3, int[]::new);
        System.out.println(intArr_2.length);
    }
    //����һ�������������������鳤��,����ʽ�ӿڣ�����ʹ��lambda�ӿ�
    protected static int[] method(int lenght,ArrayBuilder arrayBuilder){
            return   arrayBuilder.buildArr(lenght);
    }
}
