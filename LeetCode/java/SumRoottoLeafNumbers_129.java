package LeetCode.java;

// 26-08-03 15min
// https://leetcode.com/problems/sum-root-to-leaf-numbers
public class SumRoottoLeafNumbers_129 {

    public int sumNumbers(TreeNode root) {

        return sumBoth(root, 0);
    }

    int sumBoth(TreeNode current, int number) {

        int sum = 0;
        int currentNumber = number * 10 + current.val;
        // System.out.println(current.val);
        if (current.left == null && current.right == null) {
            sum += currentNumber;
        } else if (current.right == null) {
            sum += sumBoth(current.left, currentNumber);
        } else if (current.left == null) {
            sum += sumBoth(current.right, currentNumber);
        } else {
            sum += sumBoth(current.left, currentNumber);
            sum += sumBoth(current.right, currentNumber);
        }

        // if (current.left == null) {
        //     System.out.println("null, " + currentNumber + ", " + sum);
        // } else {
        //     System.out.println(currentNumber + ", " + current.left.val + ", " + sum);
        // }

        // if () {
        //     sum += currentNumber;
        //     System.out.println("null, " + currentNumber + ", " + sum);
        // } else {
        //     System.out.println(currentNumber + ", " + current.right.val + ", " + sum);
        // }

        return sum;
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