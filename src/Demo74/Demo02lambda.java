package Demo74;

/**
 * ��־����
 * ���´�����������˷ѵ�����
 */
public class Demo02lambda {
    public static void main(String[] args) {
        String message_1="hello";
        String message_2="world";
        String message_3="java";
        //����log����������
        log(1,message_1+message_2+message_3);

    }

    //����һ��������־�ļ�����ʾ��־����Ϣ
    private static void log(int level,String message) {
        if (level==1){
            System.out.println(message);
        }
    }
}
