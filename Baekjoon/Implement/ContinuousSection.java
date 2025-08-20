package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-20 10min
// https://www.acmicpc.net/problem/2495
public class ContinuousSection {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String number = br.readLine();
            int[] count = new int[10];
            int prev = number.charAt(0) - '0';
            count[prev]++;
            int currentCount = 1;
            int max = 0;
            for (int j = 1; j < number.length(); j++) {
                int current = number.charAt(j) - '0';

                if (prev == current) {
                    currentCount++;
                    max = Math.max(max, currentCount);
                } else {
                    count[prev] = Math.max(count[prev], currentCount);
                    currentCount = 1;
                    max = Math.max(max, count[prev]);
                }
                prev = current;
            }
            sb.append(Math.max(max, currentCount)).append("\n");
        }

        System.out.println(sb);
    }

}