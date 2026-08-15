package LeetCode.java;

// 26-08-15 3min
// https://leetcode.com/problems/reverse-words-in-a-string-iii
public class ReverseWordsinaStringIII_557 {

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            StringBuilder temp = new StringBuilder();
            answer.append(temp.append(split[i]).reverse()).append(' ');
        }

        return answer.toString().trim();
    }
}