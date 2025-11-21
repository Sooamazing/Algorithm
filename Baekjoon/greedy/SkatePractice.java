package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-21 40min
// https://www.acmicpc.net/problem/28324
public class SkatePractice {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] skates = new int[total + 1];
        int[] dp = new int[total + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            skates[i] = Integer.parseInt(st.nextToken());
        }

        dp[total - 1] = 1;
        long sum = 1;
        for (int i = total - 2; i >= 0; i--) {
            sum += dp[i] = Math.min(dp[i + 1] + 1, skates[i]);
        }

        System.out.println(sum);
    }
}