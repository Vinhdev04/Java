package Example;

public class Exam06 {
    public static void main(String[] args) {
        // chuyen doi int -> Integer
        int a = 20;
        Integer i = Integer.valueOf(a); // đổi int -> Integer
        Integer j = a; // tự chuyển int -> Integer
        System.out.println(a + " " + i + " " + j);
        ConvertWrapper();
    }

    public  static void ConvertWrapper() {
        Integer a = new Integer(3);
        int i = a.intValue(); // đổi Integer -> int
        int  j = a; // tự động đổi Integer -> int
        System.out.println(a + " " + i + " " + j);
    }
}
