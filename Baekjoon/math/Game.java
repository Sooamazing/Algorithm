package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-22 35min
// https://www.acmicpc.net/problem/1072
public class Game {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long total = Long.parseLong(st.nextToken());
        long win = Long.parseLong(st.nextToken());
        int winningRate = Math.toIntExact(win * 100 / total);
        int goalWinningRate = winningRate + 1;

        if (goalWinningRate >= 100) {
            System.out.println(-1);
            return;
        }

        System.out.println(
                (int) Math.ceil(
                        (win * 100 - goalWinningRate * total) * 10
                                / (goalWinningRate - 100.0) / 10));
    }
}