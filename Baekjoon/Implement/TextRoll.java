package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-27 20min
// https://www.acmicpc.net/problem/9494
public class TextRoll {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                break;
            }

            int start = 0;
            for (int i = 0; i < number; i++) {
                String sentence = br.readLine();
                boolean isFinish = false;
                for (int j = start; j < sentence.length(); j++) {
                    if (sentence.charAt(j) == ' ') {
                        isFinish = true;
                        start = j;
                        break;
                    }
                }

                if (!isFinish) {
                    start = Math.max(start, sentence.length());
                }
            }
            sb.append(start + 1).append('\n');
        }

        System.out.println(sb);
    }
}