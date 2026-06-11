package LeetCode.java;

import java.util.Arrays;

// 26-06-11 4min
// https://leetcode.com/problems/minimum-common-value
public class MinimumCommonValue_2540 {

    public int getCommon(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int num1Length = nums1.length;
        int num2Length = nums2.length;

        if (num1Length < num2Length) {
            for (int i = 0; i < num1Length; i++) {
                int index = Arrays.binarySearch(nums2, nums1[i]);
                if (index >= 0) {
                    return nums1[i];
                }
            }
        } else {
            for (int i = 0; i < num2Length; i++) {
                int index = Arrays.binarySearch(nums1, nums2[i]);
                if (index >= 0) {
                    return nums2[i];
                }
            }
        }

        return -1;
    }
}