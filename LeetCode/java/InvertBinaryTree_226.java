package LeetCode.java;

// 26-08-13 7min
// https://leetcode.com/problems/invert-binary-tree
public class InvertBinaryTree_226 {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }
        if (root.left != null && root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        } else if (root.left != null) {
            root.right = root.left;
            root.left = null;
            invertTree(root.right);
        } else if (root.right != null) {
            root.left = root.right;
            root.right = null;
            invertTree(root.left);
        }
        return root;
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