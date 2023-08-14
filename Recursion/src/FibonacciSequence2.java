public class FibonacciSequence2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("n = " + n + ", fib(n) = " + fib(n));
    }

    private static long fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long a = 0;
        long b = 1;
        for (int i = 0; i < n - 1; i++) {
            long tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}

// TC: O(n)
// SC: O(1)
