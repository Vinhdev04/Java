package Bai05;

import java.util.Scanner;

public class CIRCLE {
    private double r;
    
    //---------------------------------------------------------------//
    public CIRCLE() {
    }
    //---------------------------------------------------------------//
    public CIRCLE(double r) {
        this.r = r;
    }
    //---------------------------------------------------------------//
    public double getR() {
        return r;
    }
    //---------------------------------------------------------------//
    public void setR(double r) {
        this.r = r;
    }
    //---------------------------------------------------------------//
    public double tinhCV() {
        return (2 * Math.PI * r); // 2*pi*r
    }
    //---------------------------------------------------------------//
    public double tinhDT() {
        return (Math.PI * r * r); // pi*r*r
    }
    //---------------------------------------------------------------//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh (r): ");
        this.r = scanner.nextDouble();
        scanner.close(); // Đóng Scanner sau khi không còn sử dụng
    }
    //---------------------------------------------------------------//
    public void outputData() {
        System.out.println("Ban kinh (r): " + this.getR());
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
        CIRCLE cr1 = new CIRCLE();
        cr1.inputData();
        cr1.outputData();
        System.out.printf("Chu vi: %.2f\n" , cr1.tinhCV());
        System.out.printf("Dien tich: %.2f", cr1.tinhDT());
    }
    //---------------------------------------------------------------//
}
