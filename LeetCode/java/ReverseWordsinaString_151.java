package LeetCode.java;

// 26-08-01 15min
// https://leetcode.com/problems/reverse-words-in-a-string
public class ReverseWordsinaString_151 {

    public String reverseWords(String s) {
        // StringTokenizer st = new StringTokenizer(s);
        String[] split = s.split(" ");

        StringBuilder sb = new StringBuilder();
        // while(st.hasNextToken()){
        //     sb.insert(0, st.nextToken()+" ");
        // }
        for (String str : split) {
            if (str.isBlank()) {
                continue;
            }
            sb.insert(0, str + " ");
        }
        return sb.toString().trim();
    }
}