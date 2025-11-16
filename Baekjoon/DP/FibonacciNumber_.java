package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 25-11-16 5min
// https://www.acmicpc.net/problem/4150
public class FibonacciNumber_ {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int last = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[last + 3];

        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        for (int i = 2; i <= last; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[last]);
    }
}