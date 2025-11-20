package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 25-11-20 25min
// https://www.acmicpc.net/problem/28432
// 참고: https://www.acmicpc.net/board/view/143922
public class Shiritori {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String[] set = new String[total];
        char first = '0';
        char last = '0';
        for (int i = 0; i < total; i++) {
            String word = set[i] = br.readLine();
            if (word.charAt(0) == '?') {
                if (i != 0) {
                    first = set[i - 1].charAt(set[i - 1].length() - 1);
                }
            }
            if (i != 0 && set[i - 1].charAt(0) == '?') {
                last = word.charAt(0);
            }
        }

        boolean isFirst = first == '0' && last != '0';
        boolean isLast = last == '0' && first != '0';
        int candidate = Integer.parseInt(br.readLine());
        Arrays.sort(set);

        String answer = null;
        for (int i = 0; i < candidate; i++) {
            String word = br.readLine();
            if (set.length == 1) {
                answer = word;
                break;
            }
            if (Arrays.binarySearch(set, word) >= 0) {
                continue;
            }
            if (isFirst) {
                if (word.charAt(word.length() - 1) == last) {
                    answer = word;
                    break;
                }
            } else if (isLast) {
                if (word.charAt(0) == first) {
                    answer = word;
                    break;
                }
            } else {
                if (word.charAt(word.length() - 1) == last && word.charAt(0) == first) {
                    answer = word;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}