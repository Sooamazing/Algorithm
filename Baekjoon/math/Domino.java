package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-23 5min
// https://www.acmicpc.net/problem/2921
public class Domino {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        long result = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                result += (i + j);
            }
        }

        System.out.println(result);
    }
}
