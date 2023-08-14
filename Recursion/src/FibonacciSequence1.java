public class FibonacciSequence1 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("n = " + n + ", fib(n) = " + fib(n));
    }

//    Method1: Recursion, Only for illustration purpose, don't use it because this is an awful algorithm in time
    private static int fib(int n) {
//        base case
        if (n == 0 || n == 1) {
            return n;
        }
//        subProblem
//        Recursive rule
        return fib(n - 1) + fib(n - 2);
    }
}

// TC: O(2^n)
// It is recursive tree, which each node has two child nodes.
// In the worst case, the shape of this recursive tree being close to a full binary tree.
// So this tree approximately have 2^n nodes, which means Time Complexity will be 2^n

// SC: O(n) == Stack + Heap
// Stack and Heap usage's peak value
// Stack: O(n)
// Heap: O(1)