package Demo76.Demo06;

/**
 * @Author: hsy
 * @Date: 2022/10/19/19:04
 * @Description:
 */
@FunctionalInterface
public interface ArrayBuilder {
    //定义一个创建int类型数组的方法，参数传递数组的长度，返回创建好的int类型数组
    int[] buildArr(int lenght);
}
