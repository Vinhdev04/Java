package Bai06;

import java.util.Scanner;

public class PHUONGTRINHB2 {
    private double a,b,c,x1,x2;

    //---------------------------------------------------------------//
    public PHUONGTRINHB2(){

    }
    //---------------------------------------------------------------//
    public PHUONGTRINHB2(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    //---------------------------------------------------------------//
    public PHUONGTRINHB2(PHUONGTRINHB2 ptb2){
        this.a = ptb2.a;
        this.b = ptb2.b;
        this.c = ptb2.c;
        this.x1 = ptb2.x1;
        this.x2 = ptb2.x2;
    }
    //---------------------------------------------------------------//
    public double getA() {
        return a;
    }
    //---------------------------------------------------------------//
    public void setA(double a) {
        this.a = a;
    }
    //---------------------------------------------------------------//
    public double getB() {
        return b;
    }
    //---------------------------------------------------------------//
    public double getC() {
        return c;
    }
    //---------------------------------------------------------------//
    public void setC(double c) {
        this.c = c;
    }
    //---------------------------------------------------------------//
    public void setB(double b) {
        this.b = b;
    }
    //---------------------------------------------------------------//
    public double getX1() {
        return x1;
    }
    //---------------------------------------------------------------//
    public void setX1(double x1) {
        this.x1 = x1;
    }
    //---------------------------------------------------------------//
    public double getX2() {
        return x2;
    }
    //---------------------------------------------------------------//
    public void setX2(double x2) {
        this.x2 = x2;
    }
    //---------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a = ");
        this.a = scanner.nextDouble();
        System.out.println("Nhap b = ");
        this.b = scanner.nextDouble();
        System.out.println("Nhap c = ");
        this.c = scanner.nextDouble();
        scanner.close(); // Đóng Scanner sau khi không còn sử dụng
    }
    //---------------------------------------------------------------//
    public double tinhDelta(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    //---------------------------------------------------------------//
    public void outputData() {
        System.out.println("-------------------------------------------------------");
        System.out.println("PHUONG TRINH CO DANG: ax^2 + bx + c = 0 ");
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
        System.out.println("c: " + this.c);
        System.out.println("-------------------------------------------------------");
        System.out.printf("PHUONG TRINH VUA NHAP: %.1fx^2 + %.1fx + %.1f = 0\n", this.a, this.b, this.c);
        System.out.println("-------------------------------------------------------");
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                System.out.printf("Phuong trinh co mot nghiem: x = %.1f\n", -this.c / this.b);
            }
        } else {
            double delta = tinhDelta();
            if (delta == 0) {
                System.out.printf("Nghiem kep: x1 = x2 = %.1f\n", -this.b / (2 * this.a));
            } else if (delta > 0) {
                double x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
                double x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
                System.out.printf("Nghiem x1 = %.1f\n", x1);
                System.out.printf("Nghiem x2 = %.1f\n", x2);
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("------  TÌM NGHIỆM THOE ĐỊNH LÝ VI-ET: ------");
        giaiPTB2TheoViet();
        System.out.println("-------------------------------------------------------");
    }
    //---------------------------------------------------------------//
    public void giaiPTB2TheoViet() {
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: x = " + (-this.c / this.b));
            }
        } else {
            double tong = -this.b / this.a; // x1+x2 = /b/a
            double tich = this.c / this.a;  // x1.x2 = -c/a
            double deltas = tong * tong - 4 * tich; // delta = b*b - 4*a*c

            if (deltas > 0) {
                double x1 = (tong + Math.sqrt(deltas)) / 2; // x1 = -b + sqrt(delta) / 2a
                double x2 = (tong - Math.sqrt(deltas)) / 2; // x2 = -b - sqrt(delta) / 2a
                System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.1f, x2 = %.1f\n", x1, x2);
            } else if (deltas == 0) {
                double x = tong / 2; // x1 = x2 = -b / 2a
                System.out.printf("Phuong trinh co nghiem kep: x1 = x2 = %.1f\n", x);
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
        PHUONGTRINHB2 pt2 = new PHUONGTRINHB2();
        pt2.inputData();
        pt2.outputData();
    }
    //---------------------------------------------------------------//
}

