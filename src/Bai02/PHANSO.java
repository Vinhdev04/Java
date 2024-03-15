package Bai02;

import java.util.Scanner;

public class PHANSO {
    private int tuSo;
    private int mauSo;

    public PHANSO(){
        tuSo = 0;
        mauSo = 1;
    }
    public PHANSO(int tuSo,int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    //---------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tuSo = scanner.nextInt();
        System.out.println("Nhap mau so: ");
        this.mauSo = scanner.nextInt();
    }
    //---------------------------------------------------------------//
    public void outData() {
        rutGon(); // Gọi phương thức rút gọn trước khi in ra kết quả
        // Nếu cả tử số và mẫu số đều âm, chuyển chúng thành dương
        if (tuSo < 0 && mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        // Nếu mẫu số là 1 hoặc -1, chỉ cần in ra tử số
        if (mauSo == 1 || mauSo == -1) {
            System.out.println("OUTPUT: " + tuSo);
        } else {
            System.out.println("OUTPUT: " + tuSo + " / " + mauSo);
        }
    }

    //------------------------- CÁCH 1----------------------------------//
    public int timUCLN(int a,int b){
        a = Math.abs(a); // Lấy giá trị tuyệt đối để đảm bảo tính toán đúng
        b = Math.abs(b);
            while(a!=b){
                if(a>b)
                    a -= b;
                else
                    b -= a;
            }
            return a;
    }
    //------------------------- CÁCH 2 ----------------------------------//
                /*public int tissmUCLN(int a,int b){
                        if(a==0)
                            return b;
                        return timUCLN(b%a, a);
                    }*/
    //-----------------------------------------------------------//
    public void rutGon(){
        int temp = timUCLN(tuSo,mauSo);
        tuSo /= temp;
        mauSo /= temp;
    }
    //---------------------------------------------------------------//
    public PHANSO cong(PHANSO p){
        PHANSO kq = new PHANSO();

        kq.mauSo = this.mauSo * p.mauSo;
        kq.tuSo = this.tuSo*p.mauSo + p.tuSo*this.mauSo;
        kq.rutGon();
        return  kq;
    }
    //---------------------------------------------------------------//

    public PHANSO tru(PHANSO p){
        PHANSO kq = new PHANSO();

        kq.mauSo = this.mauSo * p.mauSo;
        kq.tuSo = this.tuSo*p.mauSo - p.tuSo*this.mauSo;
        kq.rutGon();
        return kq;
    }
    //---------------------------------------------------------------//
    public PHANSO nhan(PHANSO p){
        PHANSO kq = new PHANSO();

        kq.mauSo = this.mauSo * p.mauSo;
        kq.tuSo = this.tuSo * p.tuSo;
        kq.rutGon();
        return kq;
    }
    //---------------------------------------------------------------//
    public PHANSO chia(PHANSO p){
        PHANSO kq = new PHANSO();

        kq.mauSo = this.mauSo * p.tuSo; // Đổi chỗ giữa tử số và mẫu số của p
        kq.tuSo = this.tuSo * p.mauSo;
        kq.rutGon();
        return kq;
    }
    //------------------------- CÁCH 2 ----------------------------------//
    public PHANSO chiaPS(PHANSO p) {
        if (p.mauSo == 0) {
            // Xử lý trường hợp mẫu số của phân số thứ hai bằng 0
            System.out.println("Lỗi: Chia cho phân số có mẫu số bằng 0!");
            return null;
        } else if (p.tuSo == 0 && p.mauSo == 0) {
            // Xử lý trường hợp cả tử số và mẫu số của phân số thứ hai đều bằng 0
            System.out.println("Lỗi: Chia cho phân số 0/0!");
            return null;
        } else {
            // Xử lý trường hợp chung
            PHANSO kq = new PHANSO();
            kq.mauSo = this.mauSo * p.tuSo; // Đổi chỗ giữa tử số và mẫu số của p
            kq.tuSo = this.tuSo * p.mauSo;
            kq.rutGon();
            return kq;
        }
    }
    //---------------------------------------------------------------//
    public static void main(String[] args) {
        PHANSO ps1 = new PHANSO();
        PHANSO ps2 = new PHANSO();
        ps1.inputData();
        ps1.outData();
        ps2.inputData();
        ps2.outData();

        PHANSO kq1 = ps1.cong(ps2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Phep cong : ");
        kq1.outData();

        PHANSO kq2 = ps1.tru(ps2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Phep tru : ");
        kq2.outData();

        PHANSO kq3 = ps1.nhan(ps2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Phep nhan: ");
        kq3.outData();

        PHANSO kq4 = ps1.chia(ps2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Phep chia: ");
        kq4.outData();

        PHANSO kq5 = ps1.chiaPS(ps2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Phep chia: ");
        kq5.outData();
    }
}
