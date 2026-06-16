package LeetCode.java;

// 26-06-16 7min
// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
public class CheckIfAll1sAreatLeastLengthKPlacesAway_1437 {

    public boolean kLengthApart(int[] nums, int k) {

        int distance = 0;
        boolean isFirst = true;
        for (int v : nums) {
            if (v == 1) {
                if (isFirst) {
                    isFirst = false;
                    distance = 0;
                    continue;
                }
                if (distance < k) {
                    return false;
                }
                distance = 0;
                continue;
            }
            distance++;
        }
        return true;
    }
}