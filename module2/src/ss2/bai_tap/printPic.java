package ss2.bai_tap;
import java.util.Scanner;
public class printPic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon hinh can ve");
        System.out.println("1.Hinh chu nhat");
        System.out.println("2.Hinh tam giac vuong co goc vuong o bottom-left");
        System.out.println("3.iHnh tam giac vuong co goc vuong o top-left");
        int choice = 0;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }

                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                for (int i = 4; i > 0; i--) {
                    for (int j = 0; j <= 6; j++) {
                        if (j >= i && j <= 6 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }

                }
        }
    }
}
