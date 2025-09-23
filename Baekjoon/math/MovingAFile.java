package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 25-09-23 5min
// https://www.acmicpc.net/problem/11943
public class MovingAFile {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstApple = Integer.parseInt(st.nextToken());
        int firstOrange = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int secondApple = Integer.parseInt(st.nextToken());
        int secondOrange = Integer.parseInt(st.nextToken());

        int moveToFirst = firstOrange + secondApple;
        int moveToSecond = firstApple + secondOrange;

        System.out.println(Math.min(moveToFirst, moveToSecond));
    }
}