package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-13 25min
// https://www.acmicpc.net/problem/11586
public class PrincessJiyoungsMagicMirror {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder original = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int row = Integer.parseInt(br.readLine());
        for (int i = 0; i < row; i++) {
            original.append(br.readLine()).append('\n');
        }

        int anger = Integer.parseInt(br.readLine());
        if (anger == 1) {
            answer = original;
        } else if (anger == 2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    answer.append(original.charAt(i * row + (row - 1 - j) + i));
                }
                answer.append('\n');
            }
        } else if (anger == 3) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    int index = (row - 1 - i) * row + j + (row - 1 - i);
                    answer.append(original.charAt(index));
                }
                answer.append('\n');
            }
        }

        System.out.println(answer);
    }
}