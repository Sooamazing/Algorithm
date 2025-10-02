package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-02 20min
// https://www.acmicpc.net/problem/2596
public class SecretLetter {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
//        A 000000
//        B 001111
//        C 010011
//        D 011100
//        E 100110
//        F 101001
//        G 110101
//        H 111010
        // 000100
        String[] codes = {
                "000000", "001111", "010011", "011100",
                "100110", "101001", "110101", "111010"
        };
        String letters = br.readLine();
        for (int idx = 0; idx < letters.length(); idx += 6) {
            String segment = letters.substring(idx, idx + 6);
            boolean isEqual = hasEqualAlphabet(codes, segment, sb);
            if (isEqual) {
                continue;
            }

            // 한 글자만 다른 경우
            int diffCount = 0;
            int diffIndex = -1;
            int minDiffIndex = 60;
            boolean isOneDiff = false;
            for (int i = 0; i < codes.length; i++) {
                for (int j = 0; j < 6; j++) {
                    if (codes[i].charAt(j) != segment.charAt(j)) {
                        diffCount++;
                        diffIndex = j;
                        if (diffCount > 1) {
                            minDiffIndex = Math.min(minDiffIndex, diffIndex);
                            break;
                        }
                    }
                }
                if (diffCount == 1) {
                    sb.append((char) ('A' + i));
                    isOneDiff = true;
                    break;
                }
                diffCount = 0;
            }

            // 완전 다른 경우
            if (!isOneDiff) {
                System.out.println(idx / 6 + 1);
                return;
            }
        }

        System.out.println(sb);
    }

    private static boolean hasEqualAlphabet(String[] codes, String segment, StringBuilder sb) {

        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(segment)) {
                sb.append((char) ('A' + i));
                return true;
            }
        }

        return false;
    }
}