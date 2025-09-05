package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-05 1min
// https://www.acmicpc.net/problem/23795
public class GambleJustForFun {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            int money = Integer.parseInt(br.readLine());
            if (money == -1) {
                break;
            }
            sum += money;
        }

        System.out.println(sum);
    }
}