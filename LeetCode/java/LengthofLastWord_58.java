package LeetCode.java;

// 26-08-10 5min
// https://leetcode.com/problems/length-of-last-word
public class LengthofLastWord_58 {

    public int lengthOfLastWord(String s) {

        String[] split = s.split(" ");
        for (int i = split.length - 1; i > 0; i--) {
            if (!split[i].equals(" ")) {
                return split[i].length();
            }
        }
        return split[0].length();
    }
}