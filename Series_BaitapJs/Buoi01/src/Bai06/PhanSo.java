package Bai06;
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;
    //--------------------------------------------------------------------//
    public PhanSo() {
        // No need to assign values in the default constructor
    }
    //--------------------------------------------------------------------//
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    //--------------------------------------------------------------------//
    public int getTu() {
        return tu;
    }
    //--------------------------------------------------------------------//
    public int getMau() {
        return mau;
    }
    //--------------------------------------------------------------------//
    public void setTu(int tu) {
        this.tu = tu;
    }
    //--------------------------------------------------------------------//
    public void setMau(int mau) {
        this.mau = mau;
    }
    //--------------------------------------------------------------------//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tu = scanner.nextInt();
        do {
            System.out.println("Nhap mau so (khac 0): ");
            this.mau = scanner.nextInt();
        } while (mau == 0);
    }
    //--------------------------------------------------------------------//
    public void outputData() {
        rutGon();
        System.out.println("Phan so vua nhap: " + getTu() + " / " + getMau());
    }
    //--------------------------------------------------------------------//
    public int ucln(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    //--------------------------------------------------------------------//
    public void rutGon() {
        int temp = ucln(this.tu, this.mau);
        this.tu = this.tu / temp;
        this.mau = this.mau / temp;
    }
    //--------------------------------------------------------------------//
    public PhanSo congPhanSo(PhanSo ps) {
        PhanSo kq = new PhanSo();
        int tu = this.tu * ps.mau + this.mau * ps.tu;
        int mau = this.mau * ps.mau;
        kq.setTu(tu);
        kq.setMau(mau);
        kq.rutGon();
        return kq;
    }

    //--------------------------------------------------------------------//
    public PhanSo nhanPhanSo(PhanSo ps) {
        PhanSo kq = new PhanSo();
        int tu = this.tu * ps.tu;
        int mau = this.mau * ps.mau;
        kq.setTu(tu);
        kq.setMau(mau);
        kq.rutGon();
        return kq;
    }

    //--------------------------------------------------------------------//
    public PhanSo chiaPhanSo(PhanSo ps) {
        PhanSo kq = new PhanSo();
        int tu = this.tu * ps.mau;
        int mau = this.mau * ps.tu;
        kq.setTu(tu);
        kq.setMau(mau);
        kq.rutGon();
        return kq;
    }

    //--------------------------------------------------------------------//
    public PhanSo truPhanSo(PhanSo ps) {
        PhanSo kq = new PhanSo();
        int tu = this.tu * ps.mau - this.mau * ps.tu;
        int mau = this.mau * ps.mau;
        kq.setTu(tu);
        kq.setMau(mau);
        kq.rutGon();
        return kq;
    }
    //--------------------------------------------------------------------//


}
