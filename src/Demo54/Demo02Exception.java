package Demo54;
/*
    异常的产生过程解析（分析异常是怎么产生的，如果处理异常）：
    看图

 */
public class Demo02Exception {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};

        System.out.println(getArray(a,2));
    }
/*
定义一个方法，获取数组指定索引的元素
 */
    private static int getArray(int[]array,int a) {
        int i = array[a];
        return i;
    }
}
