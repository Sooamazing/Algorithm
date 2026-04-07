package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-07 3min
// https://www.acmicpc.net/problem/5341
public class Pyramids {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int floor = Integer.parseInt(br.readLine());
            if (floor == 0) {
                break;
            }

            sb.append(
                    (long) ((long) floor * (floor + 1) / 2.0)
            ).append('\n');
        }

        System.out.println(sb);
    }
}