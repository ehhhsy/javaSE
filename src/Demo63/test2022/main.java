package Demo63.test2022;
        public class main {
            public static void main(String[] args) {
            //匿名对象
                inCook(new cook() {
                    @Override
                    public void makeFood() {
                        System.out.println("开饭了");
                    }
                });
                //lambda实现
                inCook(()->{
                    System.out.println("hello");
                });
            }



            public static void inCook(cook c){
                c.makeFood();
            }
}
