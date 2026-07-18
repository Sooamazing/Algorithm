package Leetcode.java;

// 26-07-18 3min
// https://leetcode.com/problems/find-greatest-common-divisor-of-array
import java.util.Arrays;

class FindGreatestCommonDivisorofArray_1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        return gcd(nums[0], nums[nums.length-1]);
    }

    private int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd(y, x%y);
    }
}
