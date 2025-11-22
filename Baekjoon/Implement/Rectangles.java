package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-22 3min
// https://www.acmicpc.net/problem/15232
public class Rectangles {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}