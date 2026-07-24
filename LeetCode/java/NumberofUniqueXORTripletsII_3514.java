package LeetCode.java;

// 26-07-24 20min
// https://leetcode.com/problems/number-of-unique-xor-triplets-ii
public class NumberofUniqueXORTripletsII_3514 {

    public int uniqueXorTriplets(int[] nums) {

        int length = nums.length;

        final int MAX = 2048; // why?

        boolean[] pair = new boolean[MAX];
        boolean[] triple = new boolean[MAX];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                pair[nums[i] ^ nums[j]] = true;
            }
        }

        for (int i = 0; i < MAX; i++) {
            for (int v : nums) {
                if (!pair[i]) {
                    continue;
                }
                triple[i ^ v] = true;
            }
        }

        int answer = 0;
        for (int i = 0; i < MAX; i++) {
            if (triple[i]) {
                answer++;
            }
        }

        return answer;
    }
}