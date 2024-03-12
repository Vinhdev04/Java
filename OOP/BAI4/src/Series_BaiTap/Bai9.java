package Series_BaiTap;

public class Bai9 {
    public static void main(String[] args) {
        int x = 7;
        int y = ++x * 2 + --x * x++ - --x;
        // ++x = 8;   --x = 7 ;  --x = 6;
        // y = 8*2 + 7*7 - 7
        System.out.println("x = " + x); // 7
        System.out.println("y = " + y); // 58
    }
}
