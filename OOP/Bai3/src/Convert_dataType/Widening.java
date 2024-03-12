package Convert_dataType;

// Ếp kiểu dữ liệu (rộng)
public class Widening {
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        float f = i;
        double d = i;

        System.out.println("Gia tri Int: " + i);
        System.out.println("Gia tri cua Long: " + l);
        System.out.println("Gia tri cua Float: " + f);
        System.out.println("Gia tri cua Double: " + d);
    }
}
