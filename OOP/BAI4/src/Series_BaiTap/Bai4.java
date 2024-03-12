package Series_BaiTap;

public class Bai4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = --b + a++ +1 + --a + 2;
        /*
        * --b = 7;  --a = 4
        * c = 7 + 5 +1 +3 + 2 = 18
        * --b  = 7
        * */
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c);  // 9
    }
}
