package Bai01;
import java.util.Scanner;
public class SinhVien {
    private String hoTen;
    private String maSo;
    private double diemTB;

    //---------------------------------------------------------------------------//
    public SinhVien(){
        this.hoTen = hoTen;
        this.maSo = maSo;
        this.diemTB = diemTB;
    }

    //---------------------------------------------------------------------------//
    public String getHoTen(){
        return hoTen;
    }

    //---------------------------------------------------------------------------//
    public String getMaSo(){
        return  maSo;
    }

    //---------------------------------------------------------------------------//
    public double getDiemTB(){
        return diemTB;
    }

    //---------------------------------------------------------------------------//
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    //---------------------------------------------------------------------------//
    public void setMaSo(String maSo){
        this.maSo = maSo;
    }

    //---------------------------------------------------------------------------//
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }

    //---------------------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: " );
        this.hoTen= scanner.nextLine();
        System.out.println("Enter ma: ");
        this.maSo=  scanner.nextLine();
        System.out.println("Enter point: ");
        this.diemTB = scanner.nextDouble();
    }

    //---------------------------------------------------------------------------//
    public void rank(){
        if(getDiemTB() >=9){
            System.out.println("Xep loai: Xuat Sac");
        }else if(getDiemTB() >8.5){
            System.out.println("Xep loai: Gioi");
        }else if(getDiemTB() > 7){
            System.out.println("Xep loai: Kha");
        }else if(getDiemTB() > 5){
            System.out.println("Xep loai: Trung Binh");
        }else{
            System.out.println("Xep loai: Kha");
        }
    }

    //---------------------------------------------------------------------------//
    public void outData(){
        System.out.println("Thong tin sinh vien vua nhap: ");
        System.out.println(getHoTen() + " - " +getMaSo()  + " - " +getDiemTB() );
        rank();
    }
    //---------------------------------------------------------------------------//
}
