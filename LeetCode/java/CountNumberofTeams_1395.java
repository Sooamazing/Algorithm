package LeetCode.java;

// 26-07-03 10min
// https://leetcode.com/problems/count-number-of-teams
public class CountNumberofTeams_1395 {

    public int numTeams(int[] rating) {

        int length = rating.length;
        int sum = 0;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                if (rating[i] == rating[j]) {
                    continue;
                }
                boolean isIncreasing = rating[i] <= rating[j];
                for (int k = j + 1; k < length; k++) {
                    if (rating[j] == rating[k]) {
                        continue;
                    }
                    if ((isIncreasing && rating[j] < rating[k])
                            || (!isIncreasing && rating[j] > rating[k])) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}