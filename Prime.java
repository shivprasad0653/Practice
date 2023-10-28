//Print last 3 prime number from 1 to 100

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i > 1; i--) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count == 3) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
