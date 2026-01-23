package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-23 7min
// https://www.acmicpc.net/problem/3943
public class HailstoneSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int number = Integer.parseInt(br.readLine());
            sb.append(getSequence(number)).append('\n');
        }

        System.out.println(sb);

    }

    private static int getSequence(int number) {

        int max = number;
// n이 짝수라면, 2로 나눈다.
//n이 홀수라면, 3을 곱한 뒤 1을 더한다.

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                max = Math.max(number, max);
                continue;
            }
            number = number * 3 + 1;
            max = Math.max(number, max);
        }

        return max;
    }
}