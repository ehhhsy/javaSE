package Demo79;

/**
 * @Author: hsy
 * @Date: 2022/10/21/20:24
 * @Description:
 * | @Override         | 检测被该注解标志的方法是否是继承自父类接口 |
 * | ----------------- | ------------------------------------------ |
 * | @Deprecated       | 将该注解标注的内容已过时                   |
 * | @SuppressWarnings | 压在警告                                   |
 */
@SuppressWarnings("all")
public class Demo02 {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public void show01(){
        //有缺陷
    }
    public void  show02(){
        //替代show01();
    }

    public void demo(){
        show01();
    }
}
