package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-25 3min
// https://www.acmicpc.net/problem/31450
public class EveryoneIsWinner {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int medal = Integer.parseInt(st.nextToken());
        int kid = Integer.parseInt(st.nextToken());

        System.out.println((medal >= kid && medal % kid == 0) ? "Yes" : "No");
    }

}