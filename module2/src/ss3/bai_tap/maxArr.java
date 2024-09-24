package ss3.bai_tap;

import java.util.Scanner;

public class maxArr {
    public static void maxArray (int arr[][]){
        int arr2[] = new int[arr.length];
        int maxArr2 =arr2[0];
        for (int i = 0; i <arr.length ; i++) {
            int maxRow = arr[i][0];
            for (int j = 0; j < arr[0].length; j++) {
                if(maxRow<arr[i][j]){
                    maxRow = arr[i][j];
                }
            }
            arr2[i]= maxRow;
        }

        for (int i = 0; i < arr2.length; i++) {
            if(maxArr2<arr2[i]){
                maxArr2 = arr2[i];
            }
        }
        System.out.println("So lon nhat trong mang 2 chieu la " +maxArr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int r = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int c = sc.nextInt();
        int arr[][] = {{r},{c}};
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        maxArray(arr);
    }
}
