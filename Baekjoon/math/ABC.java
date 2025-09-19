package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-09-19 10min
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
        Arrays.sort(arr);

        String line = br.readLine();
        for (int i = 0; i < 3; i++) {
            char ch = line.charAt(i);
            answerArr[i] = arr[ch - 'A'];
        }

        for (int num : answerArr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}