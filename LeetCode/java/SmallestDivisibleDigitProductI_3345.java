package LeetCode.java;

// 26-08-06 3min
// https://leetcode.com/problems/smallest-divisible-digit-product-i
public class SmallestDivisibleDigitProductI_3345 {

    public int smallestNumber(int n, int t) {

        for (int i = n; ; i++) {
            int product = 1;
            int current = i;
            while (current != 0) {
                product *= (current % 10);
                current /= 10;
            }
            if (product % t == 0) {
                return i;
            }
        }
    }
}