package LeetCode.java;

// 26-06-29 5min
// https://leetcode.com/problems/maximum-difference-by-remapping-a-digit
public class MaximumDifferencebyRemappingaDigit_2566 {

    public int minMaxDifference(int num) {

        String numStr = String.valueOf(num);

        // max
        int max = 0;
        char change = '0';
        for (char c : numStr.toCharArray()) {
            if (c == '9') {
                continue;
            }
            change = c;
            break;
        }

        max = Integer.parseInt(numStr.replace(change, '9'));

        // min
        int min = 0;
        change = '0';
        for (char c : numStr.toCharArray()) {
            if (c == '0') {
                continue;
            }
            change = c;
            break;
        }
        min = Integer.parseInt(numStr.replace(change, '0'));

        return max - min;
    }
}