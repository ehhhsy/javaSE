//package Demo30;
//
//public interface MyinterfacePrivateA {
//    public static void methodDefault1() {
//        System.out.println("静态方法1");
//        methodStaticCommon(); ///设置了private之后，只能methodDefault1和methodDefault2内使用
////       System.out.println("AAA");
////       System.out.println("BBB");
////       System.out.println("CCC");
//    }
//
//    public static void methodDefault2() {
//        System.out.println("静态方法2");
//        methodStaticCommon();  ///设置了private之后，只能methodDefault1和methodDefault2内使用
////        System.out.println("AAA");
////        System.out.println("BBB");
////        System.out.println("CCC");
//      }
//
////      private static void methodStaticCommon(){
////        System.out.println("AAA");
////        System.out.println("BBB");
////        System.out.println("CCC");
////      }
////}