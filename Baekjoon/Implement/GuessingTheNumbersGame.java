package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-25 20min
// https://www.acmicpc.net/problem/4892
public class GuessingTheNumbersGame {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; ; i++) {
            int guessNumber = Integer.parseInt(br.readLine());
            if (guessNumber == 0) {
                break;
            }
            boolean isOdd = guessNumber % 2 != 0;

            int lastNumber = isOdd
                    ? guessNumber / 2
                    : (3 * guessNumber + 1) / 6;

            sb.append(i).append(". ").append(isOdd ? "odd " : "even ").append(lastNumber)
                    .append("\n");
        }
        System.out.println(sb);
    }
}