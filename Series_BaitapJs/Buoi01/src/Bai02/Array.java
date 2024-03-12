package Bai02;

import java.util.Scanner;

public class Array {
    private int n;
    private int a[];

    //----------------------------------------------------------------------------------------//
    public Array() {
        // Không cần thiết phải gán giá trị cho các biến instance trong constructor mặc định
    }

    //----------------------------------------------------------------------------------------//
    public int getN() {
        return n;
    }

    //----------------------------------------------------------------------------------------//
    public int[] getA() {
        return a;
    }

    //----------------------------------------------------------------------------------------//
    public void setA(int[] a) {
        this.a = a;
    }

    //----------------------------------------------------------------------------------------//
    public void setN(int n) {
        this.n = n;
    }

    //----------------------------------------------------------------------------------------//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your n(number): ");
        this.n = scanner.nextInt();

        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu" + " " + (i + 1) + " : ");
            a[i] = scanner.nextInt();
        }
    }

    //----------------------------------------------------------------------------------------//
    public void outputData() {
        System.out.println("Mang sau khi nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //----------------------------------------------------------------------------------------//
    public int timMax() {
        int max = a[0];
        for (int i = 0; i < n; i++)
            if (max < a[i])
                max = a[i];
        return max;
    }

    //----------------------------------------------------------------------------------------//
    public int timMin() {
        int min = a[0];
        for (int i = 0; i < n; i++)
            if (min > a[i])
                min = a[i];
        return min;
    }

    //----------------------------------------------------------------------------------------//
    public double tinhTBLe() {
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++)
            if (a[i] % 2 != 0) {
                sum += a[i];
                count++;
            }
        return (double) sum / count;
    }

    //----------------------------------------------------------------------------------------//
    public void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang: ");
        for(int i=0; i<n; i++){
            System.out.printf("%d \t",a[i]);
        }
    }
    //----------------------------------------------------------------------------------------//
}
