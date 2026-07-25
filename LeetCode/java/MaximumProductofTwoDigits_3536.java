package LeetCode.java;

// 26-07-25 5min
// https://leetcode.com/problems/maximum-product-of-two-digits
public class MaximumProductofTwoDigits_3536 {

    public int maxProduct(int n) {

        int first = 0,
                second = 0;
        while (n > 0) {
            int x = n % 10;
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second) {
                second = x;
            }
            n /= 10;
        }
        return first * second;
    }
}