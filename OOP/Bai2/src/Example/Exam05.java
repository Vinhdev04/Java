package Example;

public class Exam05 {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        CongMaTran();
    }
    public static void CongMaTran() {
        int a[][] = { {1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{0,1,2}, {9,8,7},{4,3,2}};

        int c[][] = new int[3][3];
        for(int i = 0; i < c.length; i++){
            for (int j = 0; j < c[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
