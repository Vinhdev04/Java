package Series_BaiTap;

public class Bai7 {
    public static void main(String[] args) {
                int m = 15;
                int n = --m + m++ + 1 + m-- + 2;
                // 14 + 14 + 1 + 15 + 2
                System.out.println("m = " + m); // 14
                System.out.println("n = " + n); // 46
    }
}

