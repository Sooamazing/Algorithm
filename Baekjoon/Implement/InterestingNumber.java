package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-01 10min
// https://www.acmicpc.net/problem/17618
public class InterestingNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 1; i <= total; i++) {
            int current = i;
            int sum = 0;
            do {
                sum += current % 10;
                current /= 10;
            } while ((current) != 0);

            if (i % sum == 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}