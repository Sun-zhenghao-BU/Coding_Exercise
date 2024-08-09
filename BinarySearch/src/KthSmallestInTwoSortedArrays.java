public class KthSmallestInTwoSortedArrays {
    public static void main(String[] args) {
        KthSmallestInTwoSortedArrays solution = new KthSmallestInTwoSortedArrays();
        int[] a = new int[]{1, 3, 5, 7, 9, 11, 15, 19};
        int[] b = new int[]{2, 4, 6, 8, 10, 12, 16, 20};
        int k = 6;
        System.out.println(solution.kth(a, b, k));
    }

    public int kth(int[] a, int[] b, int k) {
        return kth(a, 0, b, 0, k);
    }

    private int kth(int[] a, int aLeft, int[] b, int bLeft, int k) {
        // base case
        if (aLeft >= a.length) {
            return b[bLeft + k - 1];
        }
        if (bLeft >= b.length) {
            return a[aLeft + k - 1];
        }
        if (k == 1) {
            return Math.min(a[aLeft], b[bLeft]);
        }

        int amid = aLeft + k / 2 - 1;
        int bmid = bLeft + k / 2 - 1;

        int aval = amid < a.length ? a[amid] : Integer.MAX_VALUE;
        int bval = bmid < b.length ? b[bmid] : Integer.MAX_VALUE;

        // subProblem and recursion rule
        if (aval <= bval) {
            return kth(a, amid + 1, b, bLeft, k - k / 2);
        } else {
            return kth(a, aLeft, b, bmid + 1, k - k / 2);
        }
    }
}
