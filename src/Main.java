import  Bai03.COODINATE;
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
    }
}