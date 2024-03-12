package Operating;

public class Logical_Operator {
    public static void main(String[] args) {
        int a = 9;
        int b = 100;
        System.out.println(a < b && b > a); // true
        System.out.println(a > b && b > a); // false

        System.out.println(a > b || b > a ); // true
        System.out.println(a > b || b < a); // false

        System.out.println(!(a > b || b < a)); // true



    }
}
