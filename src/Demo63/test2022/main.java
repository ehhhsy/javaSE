package Demo63.test2022;
        public class main {
            public static void main(String[] args) {
            //��������
                inCook(new cook() {
                    @Override
                    public void makeFood() {
                        System.out.println("������");
                    }
                });
                //lambdaʵ��
                inCook(()->{
                    System.out.println("hello");
                });
            }



            public static void inCook(cook c){
                c.makeFood();
            }
}
