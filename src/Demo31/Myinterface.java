package Demo31;
/*
 这个子接口继承A,B，一共有4个抽象方法。
  methodA：来源接口A
  mehodB：来源接口B
  methodCommon：同时来源接口A和B
  method：来源于我自己
 */
public interface Myinterface extends MyinterfaceA,MyinterfaceB {
   public abstract  void method();


   @Override
   public default void methoddefalt() {

   }
}
