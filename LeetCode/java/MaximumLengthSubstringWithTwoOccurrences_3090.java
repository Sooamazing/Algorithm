package LeetCode.java;

// 26-08-14 6min
// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences
public class MaximumLengthSubstringWithTwoOccurrences_3090 {

    public int maximumLengthSubstring(String s) {

        int max = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int[] alphas = new int[26];
            for (int j = i; j < length; j++) {
                int index = s.charAt(j) - 'a';
                alphas[index]++;
                if (alphas[index] > 2) {
                    break;
                }
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}