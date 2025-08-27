package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-27 20min
// https://www.acmicpc.net/problem/10539
public class SubinAndProgression {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0;
        for (int i = 1; i <= total; i++) {
            long num = Long.parseLong(st.nextToken());

            if (i == 0) {
                sum += num;
                sb.append(num).append(" ");
                continue;
            }

            long currentNumber = num * i - sum;
            sb.append(currentNumber).append(" ");
            sum += currentNumber;
        }

        System.out.println(sb);
    }
}