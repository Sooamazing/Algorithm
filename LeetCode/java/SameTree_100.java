package LeetCode.java;

// 26-08-08 10min
// https://leetcode.com/problems/same-tree
public class SameTree_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        boolean isSame = true;
        if (p == null && q == null) {
            return true;
        } else if ((p != null && q == null) || p == null && q != null) {
            return false;
        }

        System.out.println(p.val + ", " + q.val);

        if (p.val == q.val) {
            if (p.left != null && q.left != null) {
                isSame = isSame && isSameTree(p.left, q.left);
            } else if (p.left == null && q.left == null) {
                isSame = isSame && true;
            } else {
                return false;
            }
            if (p.right != null && q.right != null) {
                isSame = isSame && isSameTree(p.right, q.right);
            } else if (p.right == null && q.right == null) {
                isSame = isSame && true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        return isSame;
    }

    public class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {

            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}