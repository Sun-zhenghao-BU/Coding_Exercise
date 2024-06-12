public class CheckIfBinaryTreeIsBalanced {
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
        CheckIfBinaryTreeIsBalanced solution = new CheckIfBinaryTreeIsBalanced();
        boolean res = solution.isBalanced(t1);
        System.out.println(res);
    }

    public boolean isBalanced(TreeNode root) {
        int res = getHeightOrUnbalanced(root);
//        if (res != -1) {
//            return true;
//        } else {
//            return false;
//        }
//        Simplify these code to
//        return res != -1;
        return res != -1;
    }

    public int getHeightOrUnbalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = getHeightOrUnbalanced(root.left);
        int rightResult = getHeightOrUnbalanced(root.right);
        if (leftResult == -1 || rightResult == -1) {
            return -1;
        } else if(Math.abs(leftResult - rightResult) > 1){
            return -1;
        }
        return Math.max(leftResult, rightResult) + 1;
    }
}

// TC: O(n)
// SC: O(n)