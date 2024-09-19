package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;


public class removeElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa:");
        int element = sc.nextInt();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập:"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println("Mảng sau khi xóa phần thử "+element+" là\n"+Arrays.toString(arr));
    }
}
