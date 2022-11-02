package Filemkdir.FileMkdirs;

public class c {
    public static void main(String[] args) {
        String [] array=new String[10];
        array[0]="aa";
        array[1]="11";
        array[2]="22";
        array[3]="22";
        array[4]=null;
        array[5]="22";
        array[6]="221";


        for (String s : array) {
            if (s == null || s.equals("")) {
                return;
            }
            System.out.println(s);
        }
    }
}
