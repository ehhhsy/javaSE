package Demo26;

import java.util.ArrayList;

/*
 * ArrayList当中的常用方法：
 * 
 * public boolean add (E):向集合中添加元素，参数类型和泛型一致
 * 备注：对于ArrayList集合来说，add添加东西一定是成功的，所以返回值可用不可用
 * 【但是对与其他集合（今后学习）来说，add添加动作不一定成功。】
 * 
 * public e get(int index):从集合中当前获取元素，参数是索引编号，返回值就是对应位置的元素
 *  
 *  public E remove（int index）:从集合中删掉元素，参数是索引编号，返回值就是对应位置的元素
 *  
 *  public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
	public static void main(String[] args) {
      ArrayList<String> one =new ArrayList<String>();
      
      //public boolean add (E):向集合中添加元素，因为是boolean有返回值的，返回值是（添加是否成功）
      boolean success =one.add("时间刺客");
      System.out.println(success);
      one.add("诺手");
      
      //public e get(int index):从集合中当前获取元素，
      System.out.println(one.get(0));  //时间刺客
      
      //public int size()：获取集合的尺寸长度，
      System.out.println(one.size());   //2
      
      System.out.println(one);

      //public E remove（int index）:从集合中删掉元素，
      String whoremove =one.remove(0);//有返回值      删掉的是时间刺客
      System.out.println("被删除的人是 "+whoremove);
      System.out.println(one.size());  //1
      System.out.println(one);


          System.out.println("===================");
          ArrayList<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          //add
          list.add(222);
          //get
          System.out.println(list.get(0));//10
          //size
          System.out.println(list.size());//4
          //remove
          System.out.println(list.remove(2));//30
          System.out.println(list);//[10, 20, 222]

	
	}

}
