package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-17 5min
// https://www.acmicpc.net/problem/2909
public class BuyCandy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int money = Integer.parseInt(number);
        int unit0 = Integer.parseInt(st.nextToken());

        int round = (int) Math.pow(10, unit0);
        System.out.println(Math.round(
                (double) money / round) * round);
    }
}