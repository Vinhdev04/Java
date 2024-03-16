package Bai06;

import java.util.Scanner;

public class PHUONGTRINHB1 {
    private int a;
    private int b;

    //---------------------------------------------------------------//
    public PHUONGTRINHB1(){

    }
    //---------------------------------------------------------------//
    public PHUONGTRINHB1(int a,int b){
        this.a = a;
        this.b = b;
    }
    //---------------------------------------------------------------//
    public PHUONGTRINHB1(PHUONGTRINHB1 ptb1){
        this.a = ptb1.a;
        this.b = ptb1.b;
    }
    //---------------------------------------------------------------//
    public int getA(){
        return a;
    }
    //---------------------------------------------------------------//
    public int getB(){
        return b;
    }
    //---------------------------------------------------------------//
    public void setA(int a){
        this.a = a;
    }
    //---------------------------------------------------------------//
    public void setB(int b) {
        this.b = b;
    }
    //---------------------------------------------------------------//
        public void inputData(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------------------------------------------");
            System.out.println("Nhap a: ");
            this.a = scanner.nextInt();
            System.out.println("Nhap b:");
            this.b = scanner.nextInt();
            System.out.println("-------------------------------------------------------");
            scanner.close(); // Đóng Scanner sau khi không còn sử dụng
        }
    //---------------------------------------------------------------//
        public void outputData(){
            System.out.println("Phuong trinh co dang ax+b:  ");
            System.out.println("a: " + this.getA());
            System.out.println("b: " + this.getB());
            if(this.a != 0){
                System.out.printf("Nghiem x = %.2f\n", -((double)this.b  /  this.a));
            } else if(this.a == 0 && this.b == 0){
                System.out.println("Phuong trinh co vo so nghiem.");
            } else if(this.a == 0 && this.b != 0){
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    //---------------------------------------------------------------//
        public static void main(String[] args) {
            PHUONGTRINHB1 pt1 = new PHUONGTRINHB1();
            pt1.inputData();
            pt1.outputData();
            System.out.println("-------------------------------------------------------");
            System.out.println("CONSTRUCTOR COPY: ");
            PHUONGTRINHB1 pt2 = new PHUONGTRINHB1(pt1);
            pt2.outputData();
        }
    //---------------------------------------------------------------//
}
