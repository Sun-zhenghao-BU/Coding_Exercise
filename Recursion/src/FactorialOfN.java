public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int n) {
//        base case
        if (n == 1) {
            return 1;
        }
//        subProblem
//        recursive rule
        return n * factorial(n - 1);
    }
}

// TC: O(n)
// SC: O(n)
