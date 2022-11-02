package Demo76.Demo02;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:32
 * @Description:
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
    double abs(Double num);
}
