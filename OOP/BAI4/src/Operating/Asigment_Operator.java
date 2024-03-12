package Operating;

public class Asigment_Operator {
    public static void main(String[] args) {
        int x = 1;
        x += 5; // x = x + 5
        // x = x + 5;
        System.out.println("x = " + x); //  x = 6

        int y = 2;
        y -= 5;  // x = x - 2
        System.out.println("y = " + y); // x = -3

        int z = 2;
        z *= 5;  // z = z *5
        System.out.println("z = " + z); // z = 10

        double k = 2;
        k /= 5; // k = k / 5
        System.out.println("k = " + ((double) k)); // k = 0.4

        int  m = 2;
        m %= 5; // m = m % 5
        System.out.println("m = " + m); // m = 2

        int h = 3;
         h |= 2; // h = h | 2
        System.out.println("h = " + h);
    }
}
