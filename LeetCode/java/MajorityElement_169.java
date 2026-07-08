package LeetCode.java;

import java.util.HashMap;
import java.util.Map;

// 26-07-08 7min
// https://leetcode.com/problems/majority-element
public class MajorityElement_169 {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int std = (nums.length + 1) / 2;

        int answer = 0;
        for (int v : nums) {
            int current = map.getOrDefault(v, 0);
            System.out.println(current + ", " + v);
            map.put(v, current + 1);

            if ((current + 1) >= std) {
                answer = v;
                break;
            }
        }

        return answer;

    }
}