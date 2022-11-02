package Demo76.Demo04;

/**
 * @Author: hsy
 * @Date: 2022/10/19/18:16
 * @Description:通过this引用本类的成员方法
 */
public class Husband {
    public void buyhouse(){
        System.out.println("福田区随便挑一栋");
    }
    //定义一个方法，参数传递函数式表达式，
    private void marry(Richable richable){
        richable.buy();
    }

    public void behappy(){
        //使用this.成员方法，调用本类buyhouse方法
        marry(()-> this.buyhouse());
        //使用方法引用
        /**
         使用方法引用优化lambda表达式
         this是已经存在的，
         本类的成员方法buyhouse也是存在的
         所以我们可以直接使用this引用本类的成员方法buyhouse
         */
        marry(this::buyhouse);
    }

    public static void main(String[] args) {
        new Husband().behappy();
    }
}
