package Series_BaiTap;

public class Bai6 {
    public static void main(String[] args) {
        int x = 7;
        int y = ++x * 2 + --x;
        // 8 * 2 + 7
        System.out.println("x = " + x); // 7
        System.out.println("y = " + y); // 23
    }
}
