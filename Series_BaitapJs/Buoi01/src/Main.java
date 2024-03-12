import Bai01.SinhVien;
import Bai02.Array;
import Bai03.Matrix;
import Bai04.BangCuuChuong;
import Bai05.ArrayInLine01;
import Bai05.ArrayInLine02;
import Bai06.PhanSo;

public class Main {
    public static void main(String[] args) {

        //------------------------------ SINHVIEN -------------------------------------//
       /* SinhVien sv1 = new SinhVien();
        sv1.inputData();
        sv1.outData();*/
        //--------------------------------  Array  ------------------------------------//
        /*Array arr1 = new Array();
        arr1.inputData();
        arr1.outputData();
        System.out.println();
        System.out.println("Max = " + arr1.timMax());
        System.out.println("Min = " + arr1.timMin());
        System.out.println("Trung binh cac so le = " + arr1.tinhTBLe());
        arr1.sort();*/
        //--------------------------------- Matrix  ------------------------------------//
       /* Matrix matrix1 = new Matrix();
        matrix1.inputMatrix();
        matrix1.outputMatrix();
        System.out.println("Tong ma tran = " +matrix1.tinhTong());
        matrix1.sortTangTheoHang();
        matrix1.sortTangTheoCot();*/
        //------------------------------ Bang Cuu  Chuong ------------------------------//
        BangCuuChuong bcc = new BangCuuChuong();
        bcc.inputData();
        bcc.inBangCuuChuong();
        //------------------------------- Mang In Line01 ---------------------------------//
        ArrayInLine01 mang = new ArrayInLine01();
        System.out.println("Mang truoc khi sap xep:");
        mang.inMang();
        mang.sapXepTangDan();
        System.out.println("Mang sau khi sap xep:");
        mang.inMang();
        //------------------------------- Mang In Line02 --------------------------------//
        ArrayInLine02 arr = new ArrayInLine02();
        arr.sort();
        //-----------------------------------  Phan So  ---------------------------------//
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap phan so thu nhat:");
        ps1.inputData();
        System.out.println("Nhap phan so thu hai:");
        ps2.inputData();

        System.out.println("Phan so thu nhat:");
        ps1.outputData();
        System.out.println("Phan so thu hai:");
        ps2.outputData();

        // Perform arithmetic operations
        PhanSo sum = ps1.congPhanSo(ps2);
        PhanSo sub = ps1.truPhanSo(ps2);
        PhanSo add = ps1.nhanPhanSo(ps2);
        PhanSo div = ps1.chiaPhanSo(ps2);

        System.out.println("Ket qua phep cong: " + sum.getTu() + " / " + sum.getMau());
        System.out.println("Ket qua phep tru: " + sub.getTu() + " / " + sub.getMau());
        System.out.println("Ket qua phep nhan: " + add.getTu() + " / " + add.getMau());
        System.out.println("Ket qua phep chia: " + div.getTu() + " / " + div.getMau());
        //-----------------------------------  Phan So  ---------------------------------//
    }
}