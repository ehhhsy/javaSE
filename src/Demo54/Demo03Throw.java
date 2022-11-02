package Demo54;
/*
    throw关键字：
    作用：
        可以是同thorw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException(”异常产生的原因“）
    注意：
        1.throw关键字必须写在方法内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException的子类（我们可以不处理，默认交给jvm虚拟机处理）
            throw关键字后边创建的是编译异常（写代码的时候报错），我们就必须处理这个异常，要么throw，要么try。。catch

 */
public class Demo03Throw {
    public static void main(String[] args) {
//        int []array=null;
        int []array=new int[3];
        System.out.println(getArray(array,5));
    }
    /*
    定义一个方法，获取数组指定索引的元素
    以后工作中，我们首先必须对方法传递的参数进行合法性校验
    如果参数不合法，那么我们就必须抛出异常的方法，告知方法的调用者，传递的参数有问题
    注意：
    空指针异常NullPointerException是一个运行期异常，我们不用处理，默认交给jvm处理
 */
    private static int getArray(int[]array,int a) {
        /*
        我们可以对传递过来的参数数组，进行合法性校验
        如果数组arrat的值是null
        那么我们就抛出空指针异常，告知方法的调用者”传递的数组的值是null“
         */
        if (array==null) {
            throw new NullPointerException("传递的数组的值是null");
        }
        /*
        我们可以对传递过来的参数a进行合法性校验
        如果a不在索引范围内
        就抛出数据索引越界异常，告知方法的调用者(“传递的索引超出了数组的使用范围”)
        注意：
   IndexOutOfBoundsException是一个运行期异常，我们不用处理，默认交给jvm处理
         */
        if (a<0 ||a>array.length){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出数组的使用范围");
        }
        int i = array[a];
        return i;
    }

}
