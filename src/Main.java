import  Bai03.COODINATE;
import Bai04.STAFF;
import Bai05.CIRCLE;
import Bai05.RECTANGLE;
import Bai05.TRIANGLE;
import Bai06.PHUONGTRINHB1;
import Bai06.PHUONGTRINHB2;

public class Main {
    public static void main(String[] args) {
        COODINATE kq = new COODINATE();

        kq.inputData();
        kq.outputData();
        //---------------------------------------------------------------//
        System.out.println("-------------------------------------------------------");
        System.out.println("TOA DO AB = "+kq.getValue());
        System.out.println();
        //---------------------------------------------------------------//
        kq.timDiemDoiXungOy();
        System.out.println("-------------------------------------------------------");
        kq.timDiemDoiXungOx();
        System.out.println("-------------------------------------------------------");
        //---------------------------------------------------------------//
                    kq.inToaDo(kq.getxA(), kq.getyA());
                    kq.inToaDo(kq.getxB(),kq.getyB());
        //---------------------------------------------------------------//
        kq.inToaDoNhieuLan();

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
        //---------------------------------------------------------------//
        TRIANGLE rec1 = new TRIANGLE();
        rec1.inputData();
        rec1.outputData();
        System.out.println("-----------------------------------------");
        System.out.println("Chu vi(C)= "+rec1.tinhChuVi());
        System.out.println("Dien tich(S)= "+rec1.tinhDienTich());
        System.out.println("-----------------------------------------");
        //---------------------------------------------------------------//
        RECTANGLE hcn = new RECTANGLE();
        hcn.inputData();
        hcn.outputData();
        System.out.println("Dien tich(S): "+hcn.tinhDT());
        System.out.println("Chu Vi(C): "+hcn.tinhCV());
        //---------------------------------------------------------------//
        CIRCLE cr1 = new CIRCLE();
        cr1.inputData();
        cr1.outputData();
        System.out.printf("Chu vi: %.2f\n" , cr1.tinhCV());
        System.out.printf("Dien tich: %.2f", cr1.tinhDT());
        //---------------------------------------------------------------//
        PHUONGTRINHB1 pt1 = new PHUONGTRINHB1();
        pt1.inputData();
        pt1.outputData();
        //---------------------------------------------------------------//
        PHUONGTRINHB2 pt2 = new PHUONGTRINHB2();
        pt2.inputData();
        pt2.outputData();
        //---------------------------------------------------------------//
    }
}