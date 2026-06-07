package LeetCode.java;

// 26-06-07 2min
// https://leetcode.com/problems/check-balanced-string
class CheckBalancedString_3340 {

    public boolean isBalanced(String num) {

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 1) {
                oddSum += num.charAt(i) - '0';
                continue;
            }
            evenSum += num.charAt(i) - '0';
        }

        return evenSum == oddSum;
    }
}