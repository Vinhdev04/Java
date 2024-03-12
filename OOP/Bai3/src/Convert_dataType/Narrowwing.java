package Convert_dataType;

public class Narrowwing {
    public static void main(String[] args) {
        double d = 100.4;
        long l = (long) d;
        int i = (int) l;
        float f = (float) i;
        int a = 5;
        int b = 10;
        double kq = (double) (a/ b);

        System.out.println("Gia tri cua Double: " + d);
        System.out.println("Gia tri cua Long: " + l);
        System.out.println("Gia tri cua Int: " + l);
        System.out.println("Gia tri cua Float: " + i);
        System.out.println(kq);
    }
}
