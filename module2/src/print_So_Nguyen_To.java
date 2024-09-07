public class print_So_Nguyen_To {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) //kitra so nto {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

