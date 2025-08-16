package Baekjoon.Implement;

import java.io.BufferedReader;
import java.util.StringTokenizer;

// 25-08-16 5min
// https://www.acmicpc.net/problem/25377
public class Bread {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new java.io.InputStreamReader(System.in));
        int shops = Integer.parseInt(br.readLine());
        int minBreadTime = 1_001;
        for (int i = 0; i < shops; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int timeToShop = Integer.parseInt(st.nextToken());
            int timeToBread = Integer.parseInt(st.nextToken());
            if (timeToShop > timeToBread) {
                continue;
            }
            minBreadTime = Math.min(minBreadTime, timeToBread);
        }

        System.out.println(minBreadTime == 1_001 ? -1 : minBreadTime);
    }
}