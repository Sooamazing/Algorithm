package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-09 10min
// https://www.acmicpc.net/problem/25238
public class GaheeAndDisregardingERA {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()
        );
        int monster = Integer.parseInt(st.nextToken());
        int user = Integer.parseInt(st.nextToken());

        boolean couldHit = (monster * (100 - user) / 100) < 100;

        System.out.println(couldHit ? 1 : 0);
    }
}