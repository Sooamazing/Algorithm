package LeetCode.java;

// 26-08-12 3min
// https://leetcode.com/problems/reverse-string
public class ReverseString_344 {

    public void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char first = s[i];
            s[i] = s[(s.length - 1 - i)];
            s[(s.length - 1 - i)] = first;
        }
    }
}