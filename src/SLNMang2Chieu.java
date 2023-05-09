import java.util.Scanner;

public class SLNMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng:");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột :");
        int coln = scanner.nextInt();
        double[][] arr = new double[rows][coln];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coln; j++) {
                System.out.print("Nhập phần tử tại vị trí arr[" + i + "][" + j + "] :");
                arr[i][j] = scanner.nextDouble();
            }
        }
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (max == arr[i][j]){
                    System.out.println("Số lớn nhất là " + max + " ở vị trí arr[" + i + "][" + j + "] ");
                }
            }
        }
    }

}
