package LeetCode.java;

import java.util.HashSet;
import java.util.Set;

// 26-07-29 7min
// https://leetcode.com/problems/happy-number
public class HappyNumber_202 {

    public boolean isHappy(int n) {
        // boolean[] visit = new boolean[100_000_000];
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n != 0) {
                int oneDigit = n % 10;
                sum += (oneDigit * oneDigit);
                n /= 10;
            }

            if (sum == 1) {
                return true;
            }

            // System.out.println(sum);

            n = sum;
        }
        return false;
    }
}