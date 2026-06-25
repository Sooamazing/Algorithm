package LeetCode.java;

// 26-06-25 3min
// https://leetcode.com/problems/binary-number-with-alternating-bits
public class BinaryNumberwithAlternatingBits_693 {

    public boolean hasAlternatingBits(int n) {

        String binary = Integer.toBinaryString(n);
        char prev = ' ';
        for (char c : binary.toCharArray()) {
            if (prev == c) {
                return false;
            }
            prev = c;
        }

        return true;
    }
}