package Bai05;

import java.util.Scanner;

public class RECTANGLE {
    private double cd;
    private double cr;

    //---------------------------------------------------------------//
    public RECTANGLE(){

    }
    //---------------------------------------------------------------//
    public RECTANGLE(double cd,double cr){
        this.cd = cd;
        this.cr = cr;
    }
    //---------------------------------------------------------------//
    public double getCd(){
        return cd;
    }
    //---------------------------------------------------------------//
    public double getCr(){
        return cr;
    }
    //---------------------------------------------------------------//
    public void setCd(double cd){
        this.cd = cd;
    }
    //---------------------------------------------------------------//
    public void setCr(double cr){
        this.cr = cr;
    }
    //---------------------------------------------------------------//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai(cd): ");
        this.cd = scanner.nextDouble();
        System.out.println("Nhap chieu rong(cr): ");
        this.cr = scanner.nextDouble();

        // Kiểm tra sau khi nhập dữ liệu
        if (this.cd <= 0 || this.cr <= 0) {
            System.out.println("Invalid!");
            return;
        }
    }
    //---------------------------------------------------------------//
    public void outputData(){
        System.out.println("Chieu dai: "+this.getCd());
        System.out.println("Chieu rong: "+this.getCr());
    }
    //---------------------------------------------------------------//
    public double tinhDT(){
        return cd*cr;
    }
    //---------------------------------------------------------------//
    public double tinhCV(){
        return (cd+cr)*2;
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
        RECTANGLE hcn = new RECTANGLE();
        hcn.inputData();
        hcn.outputData();
        System.out.println("Dien tich(S): "+hcn.tinhDT());
        System.out.println("Chu Vi(C): "+hcn.tinhCV());
    }
    //---------------------------------------------------------------//
}
