package Series_BaiTap;

public class Bai3 {
    public static void main(String[] args) {

        /*
        *  Các bước tính giá trị biểu thưc Prefix  và Postfix :
        * Bước 1: Tính giá tri biểu thức Prefix
        * Bước 2: Tính các phép toán  còn lại
        * Bước 3: Gán giá trị cho biến nằm ben trái dấu bằng
        * Bước 4: Tính giá trị Postfix
        * */

        int a = 5;
        int b = 3;
        int c = a++ - ++b + 1 + ++a; // 6 - 5 + 1 + 7
        /*
        * B1 : ++b = 4 ; ++a=6
        * B2: a = 5; b = 4, 1 => c = 5 - 4 + 1  + 7= 2
        * B3:  a++ = 7;
        * */
        System.out.println(a); // 7
        System.out.println(b); // 4
        System.out.println(c); // 9
    }
}
