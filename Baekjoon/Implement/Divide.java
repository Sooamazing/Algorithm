package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-12 5min
// https://www.acmicpc.net/problem/1075
public class Divide {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int divisor = Integer.parseInt(br.readLine());

        int answer = 0;
        int testNumber = number / 100 * 100;
        for (int i = 0; i < 100; i++) {
            if ((testNumber + i) % divisor == 0) {
                answer = i;
                break;
            }
        }

        System.out.println(String.format("%02d", answer));
    }
}