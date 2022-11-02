package Demo14.test_2022;
////¡∑œ∞ ÷ÿ–¥
public class demo {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.call();
        phone.lock();
        phone.show();
        System.out.println("=========================");
        iphone iphone = new iphone();
        iphone.call();
        System.out.println("---");
        iphone.lock();
        System.out.println("---");
        iphone.show();
    }
}
