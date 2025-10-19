package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-19 5min
// https://www.acmicpc.net/problem/20492
public class Tax {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int prize = Integer.parseInt(br.readLine());

        sb.append((int) (prize * 0.78)).append(" ")
                .append((int) (prize - (prize * 0.2 * 0.22)));

        System.out.println(sb);
    }
}