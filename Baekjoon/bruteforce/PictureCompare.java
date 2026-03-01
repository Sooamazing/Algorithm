package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-01 5min
// https://www.acmicpc.net/problem/2160
public class PictureCompare {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        char[][][] pictures = new char[total][5][7];
        int[][] counts = new int[total][total];

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < 5; j++) {
                pictures[i][j] = br.readLine().toCharArray();
            }
        }

        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                int count = 0;
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 7; l++) {
                        if (pictures[i][k][l] != pictures[j][k][l]) {
                            count++;
                        }
                    }
                }
                counts[i][j] = count;
            }
        }

        int row = 0;
        int col = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (counts[i][j] < min) {
                    min = counts[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println((row + 1) + " " + (col + 1));
    }
}