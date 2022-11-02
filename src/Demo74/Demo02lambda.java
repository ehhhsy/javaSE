package Demo74;

/**
 * 日志案例
 * 以下代码存在性能浪费的问题
 */
public class Demo02lambda {
    public static void main(String[] args) {
        String message_1="hello";
        String message_2="world";
        String message_3="java";
        //调用log方法，传递
        log(1,message_1+message_2+message_3);

    }

    //定义一个根据日志的级别，显示日志的信息
    private static void log(int level,String message) {
        if (level==1){
            System.out.println(message);
        }
    }
}
