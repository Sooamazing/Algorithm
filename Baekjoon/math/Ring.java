package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-08 7min
// https://www.acmicpc.net/problem/3036
public class Ring {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        for (int i = 0; i < total - 1; i++) {
            int next = Integer.parseInt(st.nextToken());
            int gcd = gcd(first, next);
            sb.append(first / gcd).append("/").append(next / gcd).append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}