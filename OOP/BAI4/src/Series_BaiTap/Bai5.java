package Series_BaiTap;

public class Bai5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a + b-- + 2;
        // 6 + 10 + 2
        System.out.println("a = " + a); // 6
        System.out.println("b = "+ b); // 10
        System.out.println("c = " + c); // 18
    }
}
