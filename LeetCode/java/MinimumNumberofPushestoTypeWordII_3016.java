package LeetCode.java;

import java.util.Arrays;

// 26-07-31 15min
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/submissions
public class MinimumNumberofPushestoTypeWordII_3016 {

    public int minimumPushes(String word) {

        int[] alphas = new int[26];
        for (char c : word.toCharArray()) {
            alphas[c - 'a']++;
        }

        int answer = 0;
        Arrays.sort(alphas);
        for (int i = 26 - 1; i >= 0; i--) {
            int count = alphas[i];
            if (count == 0) {
                break;
            }
            if (i >= 26 - 8) {
                answer += (1 * count);
            } else if (i >= 26 - 16) {
                answer += (2 * count);
            } else if (i >= 26 - 24) {
                answer += (3 * count);
            } else {
                answer += (4 * count);
            }
        }

        return answer;
    }
}