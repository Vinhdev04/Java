package test;

import java.util.Scanner;
import  java.text.NumberFormat;
import  java.util.*;

public class vidu2 {
    public static void main (String[] args){
//        Scanner nhap = new Scanner(System.in);
//        int x,y;
//
//        System.out.println("Nhap so thu 1: ");
//        x = nhap.nextInt();
//
//        System.out.println("Nhap so thu 2: ");
//        y = nhap.nextInt();
//
//        int tong = x + y;
//        System.out.println("The sum is: " + tong);
        final double TAX_RATE = 0.06; 	// 6% sales tax
        int quantity;
        double subtotal, tax, totalCost, unitPrice;
        Scanner scan = new Scanner(System.in);
        System.out.print ("So luong: ");
        quantity = scan.nextInt();
        System.out.print ("Don gia: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        // Print output with appropriate formatting
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println ("Thanh tien: " + money.format(subtotal));
        System.out.println ("Thue: " + money.format(tax) + " at " + percent.format(TAX_RATE));
        System.out.println ("Tong tien: " + money.format(totalCost));
    }
}
