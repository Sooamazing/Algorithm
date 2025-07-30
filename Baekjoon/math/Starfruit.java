package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-30 5min
// https://www.acmicpc.net/problem/17496
public class Starfruit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int summerDays = Integer.parseInt(st.nextToken());
        int growingDays = Integer.parseInt(st.nextToken());
        int maxStarfruit = Integer.parseInt(st.nextToken());
        int pricePerOne = Integer.parseInt(st.nextToken());

        System.out.println(((summerDays - 1) / growingDays) * maxStarfruit * pricePerOne);
    }
}