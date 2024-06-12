public class CountNodes {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        CountNodes solution = new CountNodes();
        int res = solution.countNodes(t1);
        System.out.println(res);
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftNums = countNodes(root.left);
        int rightNums = countNodes(root.right);
        return leftNums + rightNums + 1;
    }
}

// TC: O(n)
// SC: O(height)