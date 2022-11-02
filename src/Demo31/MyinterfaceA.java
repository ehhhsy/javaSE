package Demo31;

public interface MyinterfaceA {
   public abstract  void methodA();

   public abstract  void methodCommon();

   public default void methoddefalt(){
      System.out.println("默认的方法A");
   }

}
