package Bai03;

import java.sql.SQLOutput;
import java.util.Scanner;

//---------------------------------------------------------------//
public  class COODINATE {
    private double xA, yA;
    private double xB, yB;
    private int toaDo;

    public COODINATE() {
        xA = 0;
        yA = 0;
        xB = 0;
        yB = 0;
    }

    //---------------------------------------------------------------//
    public COODINATE(double xA, double yA, double xB, double yB) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }

    //---------------------------------------------------------------//
    public double getxA() {
        return xA;
    }

    public void setxA(int xA) {
        this.xA = xA;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(int yA) {
        this.yA = yA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(int xB) {
        this.xB = xB;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(int yB) {
        this.yB = yB;
    }

    public int getToaDo() {
        return toaDo;
    }

    public void setToaDo(int toaDo) {
        this.toaDo = toaDo;
    }

    //---------------------------------------------------------------//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Nhap toa do diem A: ");
        System.out.println("Nhap xA = ");
        this.xA = scanner.nextDouble();
        System.out.println("Nhap yA = ");
        this.yA = scanner.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Nhap toa do diem B: ");
        System.out.println("Nhap xB = ");
        this.xB = scanner.nextDouble();
        System.out.println("Nhap yB = ");
        this.yB = scanner.nextDouble();
    }

    //---------------------------------------------------------------//
    public void outputData() {
        System.out.println("OUTPUT: ");
        System.out.println("TOA DO DIEM A(xA,yA): " + "( " + this.xA + " , " + this.yA + ")");
        System.out.println("TOA DO DIEM B(xB,yB): " + "(" + this.xB + " , " + this.yB + ")");
    }

    //---------------------------------------------------------------//
    public double getValue() {
        double toaDo = Math.sqrt(Math.pow((this.xB - this.xA), 2) + Math.pow((this.yB - this.yA), 2));
        return toaDo;
    }

    //---------------------------------------------------------------//
    public void timDiemDoiXungOy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap xA = ");
        this.xA = scanner.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Nhap yA = ");
        this.yA = scanner.nextDouble();

        double xSym = -(this.xA); // A(xA,yA) => A'(-xA,yA)
        System.out.println("-------------------------------------------------------");
        System.out.println("Diem A(" + this.xA + ", " + this.yA + ")");
        System.out.println("Diem doi xung A' qua truc trung(Oy) la: A'(" + xSym + "," + this.yA + ")");
    }

    public void timDiemDoiXungOx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xB = ");
        this.xB = scanner.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Nhap yB = ");
        this.yB = scanner.nextDouble();

        double ySym = -(this.yB); // A(xB,yB) => A'(xB,-yB)
        System.out.println("-------------------------------------------------------");
        System.out.println("Diem B("+ this.xB + ", " + this.yB + ")");
        System.out.println("Diem doi xung B' qua truc hoanh(Ox) la: B'(" + this.xB + ", " + ySym + ")");
    }
    //---------------------------------------------------------------//
    public void inToaDo(double x, double y) {
        System.out.println("Toa do cua diem la: (" + x + ", " + y + ")");
    }
    //---------------------------------------------------------------//
    public void inToaDoNhieuLan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so lan ban muon in toa do: ");
        int soLan = scanner.nextInt();

        for (int i = 0; i < soLan; i++) {
            System.out.println("Nhap toa do diem M(x,y) thu " + (i + 1) + ": ");
            System.out.println("Nhap x = ");
            double x = scanner.nextDouble();
            System.out.println("Nhap y = ");
            double y = scanner.nextDouble();
            System.out.println("Toa do cua diem M(x,y) thu " + (i + 1) + " la: (" + x + ", " + y + ")");
        }

        scanner.close(); // Đóng Scanner khi không sử dụng nữa
    }
    //---------------------------------------------------------------//
}



