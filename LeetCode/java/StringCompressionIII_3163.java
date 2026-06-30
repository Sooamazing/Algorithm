package LeetCode.java;

// 26-06-30 20min
// https://leetcode.com/problems/string-compression-iii/
public class StringCompressionIII_3163 {

    public String compressedString(String word) {

        StringBuilder sb = new StringBuilder();

        int count = 1;
        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (prev == c) {
                count++;
            } else {
                while (count > 9) {
                    sb.append(9).append(prev);
                    count -= 9;
                }
                if (count > 0) {
                    sb.append(count).append(prev);
                }
                prev = c;
                count = 1;
            }
        }
        while (count > 9) {
            sb.append(9).append(prev);
            count -= 9;
        }
        if ((word.length() > 1 && word.charAt(word.length() - 1) == word.charAt(word.length() - 2))
                || count == 1) {
            sb.append(count).append(prev);
        }

        return sb.toString().trim();
    }
}