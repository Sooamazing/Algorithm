package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-02 3min
// https://www.acmicpc.net/problem/20254
public class SiteScore {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 56UR + 24TR + 14UO + 6TO
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Ur = Integer.parseInt(st.nextToken());
        int Tr = Integer.parseInt(st.nextToken());
        int Uo = Integer.parseInt(st.nextToken());
        int To = Integer.parseInt(st.nextToken());

        int result = 56 * Ur + 24 * Tr + 14 * Uo + 6 * To;
        System.out.println(result);
    }
}