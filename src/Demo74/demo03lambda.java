package Demo74;

/**
 * 使用lambda优化日志案例
 */
public class demo03lambda {
    public static void main(String[] args) {
        String message_1="hello";
        String message_2="world";
        String message_3="java";
        //调用log方法，传递参数message是函数式接口，可以传递lambda表达式
        log(1,()->{
            return message_1+message_2+message_3;
        });
    }



    //定义一个根据日志的级别，显示日志的信息，参数写上函数式接口
    private static void log(int level,message messageBuild) {
        //对日志进行判断，如果是1级，则调用Message的buildMessage方法
        if (level==1){
            System.out.println(messageBuild.buildMessage());
        }
    }
}
