package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-13 10min
// https://www.acmicpc.net/problem/2204
public class DobiesDyslexiaTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int wordCount = Integer.parseInt(br.readLine());
            if (wordCount == 0) {
                break;
            }
            String fast = "z".repeat(20);
            String lowerFast = fast.toLowerCase();
            for (int i = 0; i < wordCount; i++) {
                String word = br.readLine();
                String lowerWord = word.toLowerCase();
                if (lowerWord.compareTo(lowerFast) < 0) {
                    fast = word;
                    lowerFast = lowerWord;
                }
            }
            sb.append(fast).append("\n");
        }
        System.out.println(sb);
    }
}