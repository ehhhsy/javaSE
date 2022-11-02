package Demo66.IOtest2022;

public class recursion {
    public static void main(String[] args) {
        System.out.println(        RecurionSum(10));

    }

    private static int RecurionSum(int n) {
        if (n==1){
            return 1;
        }
        return n*RecurionSum(n-1);
    }
}
