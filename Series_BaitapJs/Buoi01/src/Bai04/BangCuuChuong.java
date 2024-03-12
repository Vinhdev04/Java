package Bai04;
import java.util.Scanner;

public class BangCuuChuong {
    private int n;

    //----------------------------------------------------------------------------------------//
    public BangCuuChuong(){
        // No need to assign values in the default constructor
    }
    //----------------------------------------------------------------------------------------//
    public int getN(){
        return n;
    }
    //----------------------------------------------------------------------------------------//
    public void setN(int n){
        this.n = n;
    }
    //----------------------------------------------------------------------------------------//
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        this.n = scanner.nextInt();

        for(int i=2; i<n; i++){
            for(int j=1; j<=10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
    //----------------------------------------------------------------------------------------//
    public void inBangCuuChuong() {
        for(int i = 2; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i + ":");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
    //----------------------------------------------------------------------------------------//

}
