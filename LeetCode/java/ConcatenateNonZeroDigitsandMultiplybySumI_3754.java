package LeetCode.java;

// 26-07-07 4min
// https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i
public class ConcatenateNonZeroDigitsandMultiplybySumI_3754 {

    public long sumAndMultiply(int n) {

        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        sb.append(0); // "" 방지
        long sum = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') {
                continue;
            }
            sb.append(c);
            sum += (c - '0');
        }

        return sum * Long.parseLong(sb.toString());
    }
}