package LeetCode.java;

import java.util.Arrays;

// 26-07-26 20min
// https://leetcode.com/problems/maximum-product-of-three-numbers
public class MaximumProductofThreeNumbers_628 {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int oLength = nums.length;
        int max = Integer.MIN_VALUE;

        int[] left;
        if (oLength <= 6) {
            left = nums;
        } else {
            left = new int[6];
            left[0] = nums[0];
            left[1] = nums[1];
            left[2] = nums[2];
            left[3] = nums[oLength - 3];
            left[4] = nums[oLength - 2];
            left[5] = nums[oLength - 1];
        }

        int length = left.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    max = Math.max(max, left[i] * left[j] * left[k]);
                }
            }
        }

        // if(nums[length-1]>=0&&nums[length-2]>=0&&nums[length-3]>=0){
        //     max = nums[length-1]*nums[length-2]*nums[length-3];
        // }
        // if(nums[0]<0&&nums[1]<0 &&nums[length-1]>=0){
        //     max=Math.max(max, nums[length-1]*nums[0]*nums[1]);
        // }
        // if(nums[0]<0&&nums[1]<0 &&nums[2]<0){
        //     max=Math.max(max, nums[0]*nums[1]*nums[2]);
        // }

        // if(nums[length-1]<0&&nums[length-2]<0&&nums[0]<0){
        //     max=Math.max(max, nums[length-1]*nums[length-2]*nums[0]);
        // }

        return max;
    }
}