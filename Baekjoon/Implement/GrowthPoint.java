package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-17 5min
// https://www.acmicpc.net/problem/1703
public class GrowthPoint {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            if (age == 0) {
                break;
            }

            int currentBranch = 1;
            for (int i = 0; i < age; i++) {
                int splittingFactor = Integer.parseInt(st.nextToken());
                int cutter = Integer.parseInt(st.nextToken());
                currentBranch *= splittingFactor;
                currentBranch -= cutter;
            }

            sb.append(currentBranch).append('\n');

        }

        System.out.println(sb);
    }
}