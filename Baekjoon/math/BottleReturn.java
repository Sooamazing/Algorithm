package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-26 5min
// https://www.acmicpc.net/problem/21300
public class BottleReturn {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(sum * 5);
    }
}