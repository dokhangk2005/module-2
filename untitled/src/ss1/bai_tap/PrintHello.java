package ss1.bai_tap;

import java.util.Scanner;

public class PrintHello {
    public static void main(String[] args) {
        System.out.println("Nhap ten cua ban: ");
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        System.out.println("Hello" + yourName);
    }
}
