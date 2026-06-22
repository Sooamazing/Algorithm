package LeetCode.java;

// 26-06-22 7min
// https://leetcode.com/problems/maximum-number-of-balloons
public class MaximumNumberofBalloons_1189 {

    public int maxNumberOfBalloons(String text) {

        int[] alphas = new int[26];
        for (char c : text.toCharArray()) {
            alphas[c - 'a']++;
        }

        int count = 0;

        while (alphas['b' - 'a'] >= 1
                && alphas['a' - 'a'] >= 1
                && alphas['l' - 'a'] >= 2
                && alphas['o' - 'a'] >= 2
                && alphas['n' - 'a'] >= 1) {
            count++;
            alphas['b' - 'a'] -= 1;
            alphas['a' - 'a'] -= 1;
            alphas['l' - 'a'] -= 2;
            alphas['o' - 'a'] -= 2;
            alphas['n' - 'a'] -= 1;

        }

        return count;
    }
}