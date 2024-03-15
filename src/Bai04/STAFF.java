package Bai04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class STAFF {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static  int soLuongNhanVien;
    private int n;
    private STAFF[]  ds;

    //---------------------------------------------------------------//
             // Constructor chuẩn không tham số
    public STAFF(){
        soLuongNhanVien++;
    }
    //---------------------------------------------------------------//
                // Constructor có tham số
    public STAFF(String maSo,String hoTen,double luongCoBan,double heSoLuong){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;

         soLuongNhanVien++;
    }
    //---------------------------------------------------------------//
                // Constructor sao chép
    public STAFF(STAFF nv){
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;;

    }
    //---------------------------------------------------------------//
    public String getMaSo(){
        return maSo;
    }
    //---------------------------------------------------------------//
    public String getHoTen(){
        return hoTen;
    }
    //---------------------------------------------------------------//
    public double getLuongCoBan(){
        return luongCoBan;
    }
    //---------------------------------------------------------------//
    public double getHeSoLuong(){
        return heSoLuong;
    }
    //---------------------------------------------------------------//
    public static int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    //---------------------------------------------------------------//
    public int getN(){
        return n;
    }
    //---------------------------------------------------------------//
    public STAFF[] getDs() {
        return ds;
    }
    //---------------------------------------------------------------//
    public void setMaSo(String maSo){
        this.maSo = maSo;
    }
    //---------------------------------------------------------------//
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    //---------------------------------------------------------------//
    public void setLuongCoBan(double luongCoBan){
        this.luongCoBan = luongCoBan ;
    }
    //---------------------------------------------------------------//
    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    //---------------------------------------------------------------//
    public void setSoLuongNhanVien(int soLuongNhanVien){
        this.soLuongNhanVien = soLuongNhanVien;
    }
    //---------------------------------------------------------------//
    public void setN(int n) {
        this.n = n;
    }
    //---------------------------------------------------------------//
    public void setDs(STAFF[] ds) {
        this.ds = ds;
    }
    //---------------------------------------------------------------//
    public double tinhTienLuong(){
        return luongCoBan*heSoLuong;
    }

    //---------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        this.maSo = scanner.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap luong co ban: ");
        this.luongCoBan = scanner.nextDouble();
        System.out.println("Nhap he so luong: ");
        this.heSoLuong = scanner.nextDouble();
    }
    //---------------------------------------------------------------//
    public void outputData(){
        System.out.println("-----------------------------------------");
        System.out.println("MA SO: " +getMaSo());
        System.out.println("TEN: " +getHoTen());
        System.out.println("TIEN LUONG: " +getLuongCoBan());
        System.out.println("HE SO LUONG:" +getHeSoLuong());
        System.out.println("TIEN LUONG: "+tinhTienLuong());
        System.out.println("SO LUONG NHAN VIEN: "+getSoLuongNhanVien());
        System.out.println("-----------------------------------------");
    }
    //---------------------------------------------------------------//
            // Hàm sắp xếp tăng dần theo hệ số lương
    public void sapXepTangTheoHeSoLuong() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getHeSoLuong() > ds[j].getHeSoLuong()) {
                    STAFF temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
    //---------------------------------------------------------------//
            // Hàm in ra nhân viên có hệ số lương cao nhất
    public void inNhanVienHeSoLuongCaoNhat() {
        // Gọi hàm sắp xếp trước khi tìm nhân viên có hệ số lương cao nhất
        sapXepTangTheoHeSoLuong();

        System.out.println("Nhan vien co he so luong cao nhat la: ");
        ds[n-1].outputData(); // Nhân viên cuối cùng sau khi sắp xếp sẽ có hệ số lương cao nhất
    }

    //---------------------------------------------------------------//
    public void inputListNV(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        n = scanner.nextInt();
        ds = new STAFF[n];
        for(int i=0; i<n; i++){
            System.out.println("Thong tin nhan vien thu " +(i+1) + " : ");
            ds[i] = new STAFF();
            ds[i].inputData();
        }
    }
    //---------------------------------------------------------------//
    public void outputListNV(){
        System.out.println("----- DANH SACH CAC NHAN VIEN VUA NHAP -----");
        for(int i=0; i<n; i++){
            ds[i].outputData();
        }
    }
    //---------------------------------------------------------------//
    public int demSLNV(){
        int count = 0;
        for(int i=0; i<n;  i++){
            count++;
        }
        return count++;
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
        //---------------------------------------------------------------//
                            // Object nv1 - Constructor no agrument
        STAFF nv1 = new STAFF();
        nv1.inputData();
        nv1.outputData();
        System.out.println("Ten nhan vien vua nhap: "+nv1.getHoTen());
        String nameX = "PHAM XUAN MANH";
        nv1.setHoTen(nameX);
        System.out.println("Ten nhan vien sau khi thay doi: " +nv1.getHoTen());
        System.out.println("-------------------------------------------------------");
        //---------------------------------------------------------------//
                            // Object nv2 - 2 argument
        STAFF nv2 = new STAFF("4444","Pham Cong Vinh",1000,2.0);
        nv2.outputData();
        //---------------------------------------------------------------//
                             // Object nv3 -> copy Object nv2
        System.out.println("-------------------------------------------------------");
        STAFF nv3 = new STAFF(nv2);
        nv3.outputData();

        //---------------------------------------------------------------//
        STAFF nv4 = new STAFF();
        nv4.inputListNV();
        nv4.outputListNV();
        nv4.sapXepTangTheoHeSoLuong();
        nv4.inNhanVienHeSoLuongCaoNhat();
        System.out.println("So luong nhan vien: "+nv4.demSLNV());
        //---------------------------------------------------------------//
    }

}
