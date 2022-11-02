package Demo08;
  //2022.9
public class book {
    public static void main(String[] args) {
        Demo02_book2022 book = new Demo02_book2022(231, "JAVA");
        System.out.println(book.getName());
        book.setName("c++");
        System.out.println(book.getName());
        System.out.println(book.getNumber());
    }
}
