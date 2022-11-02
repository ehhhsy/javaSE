package Demo65.test2022;

public class digui {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(recursion(5));
    }

    private static int sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);

    }

    public static int recursion(int n){
        if (n==1){
            return 1;
        }
        return n*recursion(n-1);
    }
}
