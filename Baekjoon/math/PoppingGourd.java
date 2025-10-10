package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-10 15min
// https://www.acmicpc.net/problem/19939
public class PoppingGourd {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ball = Integer.parseInt(st.nextToken());
        int basket = Integer.parseInt(st.nextToken());

        int minBalls = basket * (basket + 1) / 2;
        if (ball < minBalls) {
            System.out.println(-1);
            return;
        }

        int rest = (ball - minBalls) % basket;

        System.out.println(rest > 0 ? basket : basket - 1);
    }
}