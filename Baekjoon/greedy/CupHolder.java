package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-07 15min
// https://www.acmicpc.net/problem/2810
public class CupHolder {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int cupHolder = 0;
        boolean hasL = false;
        String seats = br.readLine();
        for (int i = 0; i < total; i++) {
            if (seats.charAt(i) == 'S') {
                cupHolder++;
                continue;
            }
            if (seats.charAt(i) == 'L') {
                cupHolder++;
                i++;
                hasL = true;
                continue;
            }
        }

        if (hasL) {
            cupHolder++;
        }

        System.out.println(cupHolder);
    }
}