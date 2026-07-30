package LeetCode.java;

// 26-07-30 5min
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i
public class MinimumNumberofPushestoTypeWordI_3014 {

    public int minimumPushes(String word) {

        int length = word.length();
        int answer = 0;
        for (int i = 1; i <= 4; i++) {
            if (length == 0) {
                break;
            }
            if (length > 8) {
                answer += 8 * i;
                length -= 8;
            } else {
                answer += length * i;
                length = 0;
            }
        }

        return answer;
    }
}