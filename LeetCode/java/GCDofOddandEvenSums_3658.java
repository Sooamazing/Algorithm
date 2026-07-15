package LeetCode.java;

// 26-07-15 10min
// https://leetcode.com/problems/gcd-of-odd-and-even-sums
public class GCDofOddandEvenSums_3658 {

    public int gcdOfOddEvenSums(int n) {

        int all = sumAll(n);
        int oddSum = (all + 1) / 2 - ((n + 1) / 2);
        int evenSum = (all + 1) / 2 + n / 2;

        // System.out.println(oddSum + ", "+evenSum);

        return gcd(oddSum, evenSum);
    }

    private int gcd(int x, int y) {

        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    private int sumAll(int count) {

        int sum = 0;
        for (int i = 1; i <= count * 2; i++) {
            sum += i;
        }
        return sum;
    }
}