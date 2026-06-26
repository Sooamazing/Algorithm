package LeetCode.java;

// 26-06-26 3min
// https://leetcode.com/problems/complement-of-base-10-integer
public class ComplementofBase10Integer_1009 {

    public int bitwiseComplement(int n) {

        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c == '1' ? '0' : '1');
        }

        return Integer.valueOf(sb.toString(), 2);
    }
}