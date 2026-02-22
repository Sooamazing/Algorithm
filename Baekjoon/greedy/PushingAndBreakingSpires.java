package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-22 5min
// https://www.acmicpc.net/problem/28014
public class PushingAndBreakingSpires {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int prev = 1_000_001;
        for (int i = 0; i < total; i++) {
            int spire = Integer.parseInt(st.nextToken());
            if (prev <= spire) {
                count++;
            }

            prev = spire;
        }

        System.out.println(count);
    }
}