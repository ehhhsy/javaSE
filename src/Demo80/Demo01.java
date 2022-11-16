package Demo80;

import org.junit.Test;

import java.util.Optional;

/**
 * @Author: hsy
 * @Date: 2022/11/16/18:19
 * @Description: option类的使用
 */
@SuppressWarnings("all")
public class Demo01 {
    /**
     * | Optional.of(T t)         | 创建一个Optional实例，t必须非空 |
     * | ------------------------ | ------------------------------- |
     * | Optional.empty();        | 创建一个Optional实例            |
     * | Optional.ofNullable(T t) | t可以为null                     |
     */
    @Test
    public void test1() {
        girl girl = new girl();
//        girl=null;
        //使用.of    girl要非空
        Optional<girl> optiongirl = Optional.of(girl);

        Optional<Object> o = Optional.empty();
    }

    @Test
    public void test2() {
        girl girl = new girl();
        girl = null;
        //ofNullable girl可以为空
        Optional.ofNullable(girl);
    }

    //测试空指针
    public String getGrilName(boy boy) {
        return boy.getGirl().getName();
    }

    @Test
    public void test3() {
        //java.lang.NullPointerException: Cannot invoke "Demo80.girl.getName()"
        getGrilName(new boy());
    }

    /**
     * 优化getGirlName
     * 有就返回，没用就返回other
     */
    public String getGrilName_2(boy boy) {
        //获取Option实例
        Optional<Demo80.boy> optionalBoy = Optional.ofNullable(boy);
        //判断boy是否为空,空的返回<boy是空。。。。>,不空返回本身
        Demo80.boy boy1 = optionalBoy.orElse(new boy(new girl("boy是空。。。。")));

        girl girl = boy1.getGirl();
        //判断girl是否为空，空的返回<girl是空。。。。>,不空返回本身
        Optional<Demo80.girl> optionalGirl = Optional.ofNullable(girl);
        Demo80.girl girl_2 = optionalGirl.orElse(new girl("girl是空。。。。"));

        return girl_2.getName();
    }

    @Test
    public void test4() {
        //测试boy为空
        boy boy = null;
        String grilName = getGrilName_2(boy);
        //boy是空。。。。
        System.out.println(grilName);

        //测试girl是空
        //boy已经有对象了，而girl还没有
        boy = new boy();
        String grilName2 = getGrilName_2(boy);
        ////girl是空。。。。
        System.out.println(grilName2);

        //测试boy.girl 都有参数
        Demo80.boy boy1 = new boy(new girl("叶实华"));
        String girlName3 = getGrilName_2(boy1);
        //叶实华,不为空返回本身
        System.out.println(girlName3);
    }
}
