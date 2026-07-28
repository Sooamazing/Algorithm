package LeetCode.java;

// 26-07-28 30min
// https://leetcode.com/problems/smallest-palindromic-rearrangement-i
public class SmallestPalindromicRearrangementI_3517 {

    public String smallestPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        int[] alphas = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphas[s.charAt(i) - 'a']++;
        }

        // int oddChar = -1;
        // for (int i = 0; i < 26; i++) {
        //     if (alphas[i] % 2 != 0) {
        //         oddChar = i;
        //         break;
        //     }
        // }
        // if (oddChar != -1) {

        //     int oddCount = alphas[oddChar];
        //     for (int i = 0; i < oddCount; i++) {
        //         sb.append((char) (oddChar + 'a'));
        //     }
        //     alphas[oddChar] = 0;
        // }

        // 그냥 알파벳 순서로 하고, 홀수인 건 마지막에 가운데에 넣는 방식으로 진행 필요.
        char oddChar = '0';
        for (int i = 0; i < 26; i++) {
            int count = alphas[i];
            char alpha = (char) (i + 'a');
            if (count == 0) {
                continue;
            }
            if (count % 2 == 1) {
                oddChar = alpha;
                count--;
            }
            for (int j = 0; j < count; j++) {
                sb.insert(sb.length() / 2, alpha);

            }

        }

        if (oddChar != '0') {
            sb.insert(sb.length() / 2, oddChar);
        }

        return sb.toString();

    }
}