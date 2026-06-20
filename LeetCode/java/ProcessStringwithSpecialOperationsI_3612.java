package LeetCode.java;

// 26-06-20 5min
// https://leetcode.com/problems/process-string-with-special-operations-i
public class ProcessStringwithSpecialOperationsI_3612 {

    public String processStr(String s) {

        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '*') {
                int currentLength = sb.length();
                if (currentLength > 0) {
                    sb.deleteCharAt(currentLength - 1);
                }
            } else if (current == '#') {
                sb.append(sb);
            } else if (current == '%') {
                sb = sb.reverse();
            } else {
                sb.append(current);
            }
        }

        return sb.toString();
    }
}