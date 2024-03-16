package Bai05;

import java.util.Scanner;

public class TRIANGLE {
    private double canhThu1;
    private double canhThu2;
    private double canhThu3;
    private double chieuCao;

    //---------------------------------------------------------------//
    public TRIANGLE() {

    }
    //---------------------------------------------------------------//
    public TRIANGLE(double canhThu1,double canhThu2,double canhThu3,double chieuCao){
        this.canhThu1 = canhThu1;
        this.canhThu2 = canhThu2;
        this.canhThu3 = canhThu3;
        this.chieuCao = chieuCao;
    }
    //---------------------------------------------------------------//
    public double getCanhThu1() {
        return canhThu1;
    }
    //---------------------------------------------------------------//
    public void setCanhThu1(double canhThu1) {
        this.canhThu1 = canhThu1;
    }
    //---------------------------------------------------------------//
    public double getCanhThu2() {
        return canhThu2;
    }
    //---------------------------------------------------------------//
    public double getChieuCao() {
        return chieuCao;
    }
    //---------------------------------------------------------------//
    public void setCanhThu2(double canhThu2) {
        this.canhThu2 = canhThu2;
    }
    //---------------------------------------------------------------//
    public double getCanhThu3() {
        return canhThu3;
    }
    //---------------------------------------------------------------//
    public void setCanhThu3(double canhThu3) {
        this.canhThu3 = canhThu3;
    }
    //---------------------------------------------------------------//
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    //---------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh (a) ");
        this.canhThu1 = scanner.nextDouble();
        System.out.println("Canh (b)= ");
        this.canhThu2= scanner.nextDouble();
        System.out.println("Canh (c)= ");
        this.canhThu3 = scanner.nextDouble();
        System.out.println("Chieu cao(h)= ");
        this.chieuCao = scanner.nextDouble();

        // Kiểm tra bất đẳng thức tam giác
        if (canhThu1 + canhThu2 > canhThu3 && canhThu1 + canhThu3 > canhThu2 && canhThu2 + canhThu3 > canhThu1) {
            this.canhThu1 = canhThu1;
            this.canhThu2 = canhThu2;
            this.canhThu3 = canhThu2;
        } else {
            System.out.println("Ba canh vua nhap khong tao thanh mot tam giac hop le.");
        }

        scanner.close();
    }
    //---------------------------------------------------------------//
    public void outputData(){
        System.out.println("-----------------------------------------");
        System.out.println("DO DAI 3 CANH TAM GIAC LAN LUOT LA: ");
        System.out.println("Canh a: "+this.canhThu1);
        System.out.println("Canh b: "+this.canhThu2);
        System.out.println("Canh c: "+this.canhThu3);
        System.out.println("Chieu cao h: "+this.chieuCao);
        System.out.println("-----------------------------------------");
        rank();
    }
    //---------------------------------------------------------------//
    public double tinhChuVi(){
         return canhThu1 + canhThu2 + canhThu3;

    }
    //---------------------------------------------------------------//
    public double tinhDienTich(){
        return  0.5*(canhThu2*chieuCao);

    }
    //---------------------------------------------------------------//
    public void rank() {
        // Kiểm tra bất đẳng thức tam giác
        if (canhThu1 + canhThu2 > canhThu3 && canhThu2 + canhThu3 > canhThu1 && canhThu1 + canhThu3 > canhThu2) {
            // Kiểm tra tam giác đều
            if (canhThu1 == canhThu2 && canhThu2 == canhThu3) {
                System.out.println("Tam giac deu");
            }
            // Kiểm tra tam giác cân
            else if (canhThu1 == canhThu2 || canhThu2 == canhThu3 || canhThu1 == canhThu3) {
                System.out.println("Tam giac can");
            }
            // Kiểm tra tam giác vuông
            else if (canhThu1*canhThu1 == canhThu2*canhThu2 + canhThu3*canhThu3 ||
                    canhThu2*canhThu2 == canhThu1*canhThu1 + canhThu3*canhThu3 ||
                    canhThu3*canhThu3 == canhThu1*canhThu1 + canhThu2*canhThu2) {
                System.out.println("Tam giac vuong");
            }
            // Kiểm tra tam giác tù
            else if (canhThu1*canhThu1 > canhThu2*canhThu2 + canhThu3*canhThu3 ||
                    canhThu2*canhThu2 > canhThu1*canhThu1 + canhThu3*canhThu3 ||
                    canhThu3*canhThu3 > canhThu1*canhThu1 + canhThu2*canhThu2) {
                System.out.println("Tam giac tu");
            }
            // Nếu không phải các trường hợp trên thì là tam giác nhọn
            else {
                System.out.println("Tam giac nhon");
            }
        } else {
            System.out.println("Ba canh vua nhap khong tao thanh mot tam giac hop le.");
        }
    }
    //---------------------------------------------------------------//

    public static void main(String[] args) {
        TRIANGLE rec1 = new TRIANGLE();
        rec1.inputData();
        rec1.outputData();
        System.out.println("-----------------------------------------");
        System.out.println("Chu vi(C)= "+rec1.tinhChuVi());
        System.out.println("Dien tich(S)= "+rec1.tinhDienTich());
        System.out.println("-----------------------------------------");

    }
    //---------------------------------------------------------------//
}
