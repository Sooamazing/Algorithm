package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-11 1min
// https://www.acmicpc.net/problem/26545
public class Mathematics {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int sum = 0;
        while (total-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}