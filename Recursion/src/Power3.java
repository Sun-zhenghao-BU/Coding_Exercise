public class Power3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(power3(a,b));
    }

    private static long power3(int a, int b) {
//        base case
        if (b == 0) {
            return 1;
        }
//        subProblem
        long half = power3(a, b / 2);
//        Recursive rule: Even number
        if (b % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }
}

// TC: O(logb)
// SC: O(logb)

