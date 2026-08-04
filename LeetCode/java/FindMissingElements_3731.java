package LeetCode.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// 26-08-04 5min
// https://leetcode.com/problems/find-missing-elements
public class FindMissingElements_3731 {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> answer = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int current = nums[i];
            if (prev + 1 == current) {
                continue;
            }
            prev++;
            while (prev != current) {
                answer.add(prev);
                prev++;
            }
        }

        return answer;
    }
}