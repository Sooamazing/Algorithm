package LeetCode.java;

// 26-06-13 10min
// https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string
class MinimumChangesToMakeAlternatingBinaryString_1758 {

    public int minOperations(String s) {

        int minCount = s.length();
        int change = 0;

        // 0 first
        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i) - '0';
            if (i % 2 == 0 && current != 0) {
                change++;
            } else if (i % 2 != 0 && current != 1) {
                change++;
            }
        }

        minCount = Math.min(minCount, change);
        change = 0;

        // 1 first
        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i) - '0';
            if (i % 2 == 0 && current != 1) {
                change++;
            } else if (i % 2 != 0 && current != 0) {
                change++;
            }
        }

        minCount = Math.min(minCount, change);

        return minCount;
    }
}