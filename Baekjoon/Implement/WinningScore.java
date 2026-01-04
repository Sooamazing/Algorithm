package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-04 3min
// https://www.acmicpc.net/problem/17009
public class WinningScore {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int appleScore = 0;
        for (int i = 3; i >= 1; i--) {
            appleScore += Integer.parseInt(br.readLine()) * i;
        }
        int bananaScore = 0;
        for (int i = 3; i >= 1; i--) {
            bananaScore += Integer.parseInt(br.readLine()) * i;
        }

        System.out.println(appleScore > bananaScore ? "A" : appleScore == bananaScore ? "T" : "B");
    }
}