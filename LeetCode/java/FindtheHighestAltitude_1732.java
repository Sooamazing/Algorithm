package LeetCode.java;

// 26-06-19 2min
// https://leetcode.com/problems/find-the-highest-altitude
public class FindtheHighestAltitude_1732 {

    public int largestAltitude(int[] gain) {

        int max = 0;
        int sum = 0;
        for (int v : gain) {
            sum += v;
            max = Math.max(max, sum);
        }
        return max;
    }
}