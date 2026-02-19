package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-19 5min
// https://www.acmicpc.net/problem/15700
public class FillTile4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wallWidth = Integer.parseInt(st.nextToken());
        int wallHeight = Integer.parseInt(st.nextToken());

        long shares = ((long) wallWidth * wallHeight) / 2;
        System.out.println(shares);
    }
}