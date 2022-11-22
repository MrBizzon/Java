public class Task_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }

            if (PrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
