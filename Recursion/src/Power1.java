public class Power1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(power1(a,b));
    }

    private static int power1(int a, int b) {
//        base case
        if (b == 0) {
            return 1;
        }
//        subProblem
//        Recursive rule
        return power1(a, b-1) * a;
    }
}

// TC: O(b)
// SC: O(b)

