package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-04 15min
// https://www.acmicpc.net/problem/4388
public class TakeUp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if ((first + second) == 0) {
                break;
            }

            int count = 0;
            int sum = first + second;
            while (sum != 0) {
                int firstDigit = first % 10;
                int secondDigit = second % 10;
                int sumDigit = sum % 10;

                if ((firstDigit + secondDigit) % 10 != sumDigit) {
                    count++;
                }

                first /= 10;
                second /= 10;
                sum /= 10;

            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}