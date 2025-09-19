package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-19 3min
// https://www.acmicpc.net/problem/3047
public class ABC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];
        int[] answerArr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String line = br.readLine();
        for (int i = 0; i < 3; i++) {
            char ch = line.charAt(i);
            if (ch == 'A') {
                answerArr[i] = arr[0];
            } else if (ch == 'B') {
                answerArr[i] = arr[1];
            } else {
                answerArr[i] = arr[2];
            }
        }

        for (int num : answerArr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}