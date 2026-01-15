package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-15 3min
// https://www.acmicpc.net/problem/25628
public class MakingHamburgers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int burn = Integer.parseInt(st.nextToken());
        int patty = Integer.parseInt(st.nextToken());

        int hamburger = Math.min(burn / 2, patty);

        System.out.println(hamburger);
    }
}