package ss2.bai_tap;

public class soNguyenTo2 {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
            }
            n++;
        }
    }
}
