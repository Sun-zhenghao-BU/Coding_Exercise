public class Power2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(power2(a,b));
    }

    private static int power2(int a, int b) {
//        base case
        if (b == 0) {
            return 1;
        }
//        subProblem
//        Recursive rule: Even number
        if (b % 2 == 0) {
            return power2(a, b / 2) * power2(a, b / 2);
        } else {
            return power2(a, b / 2) * power2(a, b / 2) * a;
        }
    }
}

// TC: O(b)
// SC: O(logb)
