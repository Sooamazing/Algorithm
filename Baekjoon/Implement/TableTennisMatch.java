package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-18 5min
// https://www.acmicpc.net/problem/27918
public class TableTennisMatch {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int dalgu = 0;
        int phonix = 0;
        for (int i = 0; i < total; i++) {
            char winner = br.readLine().charAt(0);

            if (winner == 'D') {
                dalgu++;
            } else {
                phonix++;
            }

            if (Math.abs(dalgu - phonix) == 2) {
                break;
            }
        }

        System.out.println(dalgu + ":" + phonix);
    }
}