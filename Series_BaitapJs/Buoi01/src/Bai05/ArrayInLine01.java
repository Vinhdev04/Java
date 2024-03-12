package Bai05;



import java.util.Arrays;

public class ArrayInLine01 {
    private int[] a;

    public ArrayInLine01() {
        a = new int[10];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
    }

    public void sapXepTangDan() {
        Arrays.sort(a);
    }

    public void inMang() {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayInLine01 mang = new ArrayInLine01();
        System.out.println("Mang truoc khi sap xep:");
        mang.inMang();
        mang.sapXepTangDan();
        System.out.println("Mang sau khi sap xep:");
        mang.inMang();
    }
}
