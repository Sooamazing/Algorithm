package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-29 10min
// https://www.acmicpc.net/problem/2966
public class Guessing {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //상근이의 아이디는 Adrian, 창영이의 아이디는 Bruno, 현진이의 아이디는 Goran이다.
        char[] adrianSequence = {'A', 'B', 'C'};
        char[] brunoSequence = {'B', 'A', 'B', 'C'};
        char[] goranSequence = {'C', 'C', 'A', 'A', 'B', 'B'};

        int adrianScore = 0;
        int brunoScore = 0;
        int goranScore = 0;
        int max = 0;
        int questionLength = Integer.parseInt(br.readLine());
        String answers = br.readLine();

        for (int i = 0; i < questionLength; i++) {
            char answer = answers.charAt(i);
            if (answer == adrianSequence[i % 3]) {
                adrianScore++;
            }
            if (answer == brunoSequence[i % 4]) {
                brunoScore++;
            }
            if (answer == goranSequence[i % 6]) {
                goranScore++;
            }
            max = Math.max(max, Math.max(adrianScore, Math.max(brunoScore, goranScore)));
        }
        sb.append(max).append('\n');

        if (max == adrianScore) {
            sb.append("Adrian\n");
        }
        if (max == brunoScore) {
            sb.append("Bruno\n");
        }
        if (max == goranScore) {
            sb.append("Goran\n");
        }

        System.out.println(sb);
    }
}