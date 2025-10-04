package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-04 5min
// https://www.acmicpc.net/problem/4299
public class AFCWimbledon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int subtract = Integer.parseInt(st.nextToken());

        for (int bigger = sum; bigger >= sum / 2; bigger--) {
            int other = sum - bigger;
            if (bigger - other == subtract) {
                System.out.println(bigger + " " + other);
                return;
            }
        }
        System.out.println(-1);
    }
}