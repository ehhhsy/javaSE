package Demo31;

public interface MyinterfaceB {
   public abstract  void methodB();

   public abstract  void methodCommon();


   public default void methoddefalt(){
      System.out.println("默认的方法B");
   }
}
