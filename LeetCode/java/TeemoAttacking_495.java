package LeetCode.java;

// 26-08-16 8min
// https://leetcode.com/problems/teemo-attacking
public class TeemoAttacking_495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (duration == 0) {
            return 0;
        }
        int poisoned = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            int prevEnd = timeSeries[i - 1] + duration - 1;
            int currentStart = timeSeries[i];
            int currentEnd = timeSeries[i] + duration - 1;
            // System.out.println(prevEnd + ", " + currentStart + ", " + currentEnd);
            if (prevEnd < currentStart) {
                poisoned += (duration);
            } else {
                poisoned += (duration - (prevEnd - currentStart + 1));
            }
        }
        return poisoned;
    }
}