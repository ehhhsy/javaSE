package Demo41;
/*
接口作为参数和返回值类型
 */
import java.util.ArrayList;
import java.util.List;
/*
  import java.util.List;正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //右边是接口名称，左边是实现类名称，这是多态写法
        List<String> list=new ArrayList<>();
          List<String> result=addNames(list);
        for (int i = 0; i < result.size(); i++) {  //遍历集合
            System.out.println(result.get(i));
        }

    }
    public static List<String> addNames(List<String> list){
        list.add( "迪丽热巴");
        list.add( "tifa");
        list.add( "拉斯");
        return list;
    }
}
