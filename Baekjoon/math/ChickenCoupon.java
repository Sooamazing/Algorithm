package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-16 25min
// https://www.acmicpc.net/problem/1673
public class ChickenCoupon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);

            int currentStamp = Integer.parseInt(st.nextToken());
            int maxStamp = Integer.parseInt(st.nextToken());

            int chicken = currentStamp;
            while (currentStamp >= maxStamp) {
                chicken += currentStamp / maxStamp;
                currentStamp = currentStamp % maxStamp + (currentStamp / maxStamp);
            }
            sb.append(chicken).append("\n");

        }

        System.out.println(sb);
    }
}