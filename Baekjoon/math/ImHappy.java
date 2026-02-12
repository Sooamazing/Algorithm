package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-12 5min
// https://www.acmicpc.net/problem/14652
public class ImHappy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int position = Integer.parseInt(st.nextToken());

        int x = position / col;
        int y = position % col;
        System.out.println(x + " " + y);
    }
}