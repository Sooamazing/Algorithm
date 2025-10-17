package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-17 10min
// https://www.acmicpc.net/problem/2846
public class UphillPath {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int max = 0;

        int prev = 0;
        int tempHillDiff = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int current = Integer.parseInt(st.nextToken());
            if (i == 0) {
                prev = current;
                continue;
            }
            int hillDiff = current - prev;
            if (prev < current && hillDiff > 0) {
                tempHillDiff += hillDiff;
                max = Math.max(max, tempHillDiff);
                prev = current;
                continue;
            }
            tempHillDiff = 0;
            prev = current;
        }

        System.out.println(max);

    }
}