package Demo74;
@FunctionalInterface
public interface message {
    //定义一个拼接信息的抽象方法，放回被拼接的字符串信息
    public abstract String buildMessage();
}
