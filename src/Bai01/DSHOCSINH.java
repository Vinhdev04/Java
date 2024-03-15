package Bai01;


import java.util.Scanner;
import java.util.logging.SocketHandler;

public class DSHOCSINH {
    private  String hoTen;
    private String maSV;
    private double diemTB;
    private int n;
    private DSHOCSINH[] ds;

    public DSHOCSINH(){
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.n = n;
        this.ds = ds;
    }

    public String getHoTen(){
        return hoTen;
    }
    public String getMaSV(){
        return  maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DSHOCSINH[] getDs() {
        return ds;
    }

    public void setDs(DSHOCSINH[] ds) {
        this.ds = ds;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }
    //---------------------------------------------------------------//
    public void inputData(){
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ten: ");
            this.hoTen = scanner.nextLine();
            System.out.println("Nhap ma sv: ");
            this.maSV = scanner.nextLine();
            System.out.println("Nhap diemTB: ");
            this.diemTB = scanner.nextDouble();
            scanner.nextLine();
            if(diemTB <= 0 || diemTB > 10) {
                System.out.println("Xin vui long nhap lai: ");
            }
        }while(diemTB<=0 || diemTB > 10);

    }
    //---------------------------------------------------------------//
    public void rank(){
        if(diemTB > 9){
            System.out.println("Xep loai: Xuat Sac");
        }else if(diemTB >8.5){
            System.out.println("Xep loai: Gioi");
        }else if(diemTB > 7){
            System.out.println("Xep loai: Kha");
        }else if(diemTB > 5){
            System.out.println("Xep loai: TB");
        }else{
            System.out.println("Xep loai: Yeu");
        }
    }
    //---------------------------------------------------------------//
    public void outputData(){
        System.out.print(getHoTen() + " - " + getMaSV() + " - " + getDiemTB() + " - " );
        rank();
    }
    //---------------------------------------------------------------//
    public void inputDSSV(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        n = scanner.nextInt();
        ds = new DSHOCSINH[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap sinh vien thu " + (i+1) + ": ");
            ds[i] = new DSHOCSINH();
            ds[i].inputData();
        }
    }
    //---------------------------------------------------------------//
    public void outputDSSV(){
        for(int i=0; i<n; i++){
            System.out.println("-------------------------------------------------------");
            System.out.println("Thong tin sinh vien thu "+ (i+1) +": ");
            ds[i].outputData();
        }
    }
    //---------------------------------------------------------------//
    public void sortDSSVTang(){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(ds[i].getDiemTB()>ds[i+1].getDiemTB()){
                    DSHOCSINH temp = ds[i];
                    ds[i] = ds[i+1];
                    ds[i+1] = temp;
                }
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Danh sach sinh vien sau khi sap xep tang theo diemTB: ");
        for(int i=0; i<n; i++){
            ds[i].outputData();
        }
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
//        DSHOCSINH sv1= new DSHOCSINH();
//        sv1.inputData();
//        sv1.outputData();

        DSHOCSINH dssv = new DSHOCSINH();
        dssv.inputDSSV();
        dssv.outputDSSV();
        dssv.sortDSSVTang();
    }
}
