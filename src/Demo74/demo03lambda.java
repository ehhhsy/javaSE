package Demo74;

/**
 * ʹ��lambda�Ż���־����
 */
public class demo03lambda {
    public static void main(String[] args) {
        String message_1="hello";
        String message_2="world";
        String message_3="java";
        //����log���������ݲ���message�Ǻ���ʽ�ӿڣ����Դ���lambda���ʽ
        log(1,()->{
            return message_1+message_2+message_3;
        });
    }



    //����һ��������־�ļ�����ʾ��־����Ϣ������д�Ϻ���ʽ�ӿ�
    private static void log(int level,message messageBuild) {
        //����־�����жϣ������1���������Message��buildMessage����
        if (level==1){
            System.out.println(messageBuild.buildMessage());
        }
    }
}
