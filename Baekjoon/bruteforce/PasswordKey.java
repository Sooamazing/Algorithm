package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-09 5min
// https://www.acmicpc.net/problem/1816
public class PasswordKey {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            long number = Long.parseLong(br.readLine());

            boolean isPrime = false;
            for (int i = 2; i < 1_000_000; i++) {
                if (number % i == 0) {
                    sb.append("NO\n");
                    isPrime = true;
                    break;
                }
            }

            if (!isPrime) {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}