public class QuickSort {
    public static void main(String[] args) {
        check();
    }

    private static void check () {
        for (int i = 6; i < 100000; i++) {
            if (counterExample(i)) {
                System.out.println("You have won Fields award!!!");
            } else {
                System.out.println(i + " is not a counter-example");
            }
        }
    }

    private static boolean counterExample(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (isPrime(j) && isPrime(j-i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int num) {
        for (int n = 2; n * n < num; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }
}
