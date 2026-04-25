package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-25 10min
// https://www.acmicpc.net/problem/1964
public class PentagonPentagonPentagon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stage = Integer.parseInt(br.readLine());

        long prev = 5;
        long current = 5;
        for (int i = 2; i <= stage; i++) {
            current = (i * 5 + prev - (i * 2 - 1)) % 45678;
            prev = current;
        }

        System.out.println(current);
    }
}