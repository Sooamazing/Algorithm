package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-15 10min
// https://www.acmicpc.net/problem/1855
public class Password {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int col = Integer.parseInt(br.readLine());
        String password = br.readLine();
        int length = password.length();
        int row = length / col;
        char[][] board = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int index = i * col + j;
                if (index % 2 == 0) {
                    board[i][j] = password.charAt(index);
                    continue;
                }
                board[i][col - j - 1] = password.charAt(index);
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sb.append(board[j][i]);
            }
        }

        System.out.println(sb);
    }
}