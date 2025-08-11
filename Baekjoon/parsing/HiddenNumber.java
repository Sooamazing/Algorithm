package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-11 15min
// https://www.acmicpc.net/problem/8595
// 반례: https://www.acmicpc.net/board/view/75665
public class HiddenNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        long result = 0;
        boolean wasNumber = isNumber(word.charAt(0));
        if (wasNumber) {
            sb.append(word.charAt(0));
        }
        for (int i = 1; i <= total; i++) {
            char currentChar;
            if (i == total) {
                currentChar = 'a';
            } else {
                currentChar = word.charAt(i);
            }
            if (wasNumber) {
                if (!isNumber(currentChar)) {
                    wasNumber = false;
                    result += Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                    continue;
                }
                sb.append(currentChar);
            } else {
                if (isNumber(currentChar)) {
                    wasNumber = true;
                    sb.append(currentChar);
                }
            }
        }

        System.out.println(result);
    }

    private static boolean isNumber(char c) {

        return c >= '0' && c <= '9';
    }
}