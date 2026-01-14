package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-14 3min
// https://www.acmicpc.net/problem/11024
public class Plus4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}