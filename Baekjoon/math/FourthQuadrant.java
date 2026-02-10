package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-10 5min
// https://www.acmicpc.net/problem/9610
public class FourthQuadrant {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        int[] counts = new int[5]; // axis,1,2,3,4
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                counts[0]++;
            } else if (x > 0 && y > 0) {
                counts[1]++;
            } else if (x < 0 && y > 0) {
                counts[2]++;
            } else if (x < 0) {
                counts[3]++;
            } else {
                counts[4]++;
            }
        }

        for (int i = 1; i < 5; i++) {
            sb.append("Q").append(i).append(": ").append(counts[i]).append('\n');
        }
        sb.append("AXIS: ").append(counts[0]).append('\n');

        System.out.println(sb);
    }
}