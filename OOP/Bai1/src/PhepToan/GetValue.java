package PhepToan;

import  java.util.Scanner;
import  java.text.NumberFormat;

public class GetValue {

    public class PhepCong {
            public static void main (String[] args){
            Scanner nhap = new Scanner(System.in);
            int x,y;

            System.out.println("Nhap so thu 1: ");
            x = nhap.nextInt();

            System.out.println("Nhap so thu 2: ");
            y = nhap.nextInt();

            int tong = x + y;
            System.out.println("The sum is: " + tong);
        }
    }
}

