package Bai03;
import java.util.Scanner;
public class Matrix {
    private int m,n;
    private int a[][];
    //----------------------------------------------------------------------------------------//
    public Matrix(int m, int n, int a[][]){
        this.m = m;
        this.n = n;
        this.a = a;
    }
    //----------------------------------------------------------------------------------------//
    public Matrix() {

    }
    //----------------------------------------------------------------------------------------//
    public int getM(){
        return m;
    }
    //----------------------------------------------------------------------------------------//
    public int getN(){
        return n;
    }
    //----------------------------------------------------------------------------------------//
    public int[][] getA(){
        return a;
    }
    //----------------------------------------------------------------------------------------//
    public void setM(int m){
        this.m = m;
    }
    //----------------------------------------------------------------------------------------//
    public void setN(int n){
        this.n = n;
    }
    //----------------------------------------------------------------------------------------//
    public void setA(int a[][]){
        this.a = a;
    }
    //----------------------------------------------------------------------------------------//
    public void inputMatrix(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so dong(m): ");
            this.m = scanner.nextInt();
        } while (m <= 0);

        do {
            System.out.println("Nhap so cot(n): ");
            this.n = scanner.nextInt();
        } while (n <= 0);

        a = new int[m][n];
        System.out.println("Ma tran co dang: " +m + " x " +n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("Dong "+ (i+1) + " cot "+(j+1) + " : ");
                a[i][j] = scanner.nextInt();
            }
        }
    }
    //----------------------------------------------------------------------------------------//
    public void outputMatrix(){
        System.out.println("Ma tran vua nhap: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    //----------------------------------------------------------------------------------------//
    public int tinhTong(){
        int sum =0;
        for(int i=0; i<m;i++)
            for(int j=0; j<n;j++)
                sum+=a[i][j];
        return sum/m*n;
    }
    //----------------------------------------------------------------------------------------//
    public void sortTangTheoHang(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k =0; k<n-j-1;k++){
                    if(a[i][k] >a[i][k+1]){
                        int temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }
        System.out.println("Ma tran sau khi sap xep tang theo hang(m): ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    //----------------------------------------------------------------------------------------//
    public void sortTangTheoCot() {
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m - 1; i++) {
                for(int k = 0; k < m - i - 1; k++) {
                    if(a[k][j] > a[k + 1][j]) {
                        int temp = a[k][j];
                        a[k][j] = a[k + 1][j];
                        a[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println("Ma tran sau khi sap xep tang theo cot(n): ");
        for(int  i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    //----------------------------------------------------------------------------------------//
}
