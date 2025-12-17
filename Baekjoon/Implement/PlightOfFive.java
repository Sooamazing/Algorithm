package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-17 5min
// https://www.acmicpc.net/problem/23037
public class PlightOfFive {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        String number = br.readLine();
        for (int i = 0; i < 5; i++) {
            int current = Integer.parseInt(number.charAt(i) + "");
            sum += Math.pow(current, 5);
        }

        System.out.println(sum);
    }
}