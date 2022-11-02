package Demo35;

public class cat_tset_2022 extends animal_test_2022{
    public static void main(String[] args) {
        cat_tset_2022 cat = new cat_tset_2022();
        dog_test_2022 dog = new dog_test_2022();
        if(cat instanceof cat_tset_2022){
            System.out.println("hello cat");
        }
        if (cat instanceof animal_test_2022){
            System.out.println("hello");
        }
        if (dog instanceof dog_test_2022){
            System.out.println("hello,dog");
        }
    }
}
