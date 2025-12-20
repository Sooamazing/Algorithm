package Baekjoon.DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-12-20 15min
// https://www.acmicpc.net/problem/17829
public class TwoTwoTwoPulling {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(pull(board, size));
    }

    private static int pull(int[][] board, int size) {

        // 1개면 벗어남
        if (size == 1) {
            return board[0][0];
        }

        int dividedSize = size / 2;
        int[][] dividedBoard = new int[dividedSize][dividedSize];
        for (int i = 0; i < dividedSize; i++) {
            for (int j = 0; j < dividedSize; j++) {
                int[] numbers = new int[4];
                // *2 값
                // 지금 위치에서 2x2 칸의 값들 가져오기
                numbers[0] = board[i * 2][j * 2];
                // +1, 0
                numbers[1] = board[i * 2 + 1][j * 2];
                // 0, +1
                numbers[2] = board[i * 2][j * 2 + 1];
                // +1, +1
                numbers[3] = board[i * 2 + 1][j * 2 + 1];

                // 두 번째로 큰 수를 dividedBoard[i][j]에 넣기
                Arrays.sort(numbers);
                dividedBoard[i][j] = numbers[2];
            }
        }

        return pull(dividedBoard, dividedSize);

//        if (length == 1) {
//            return board[startX][startY];
//        }
//
//        int newLength = length / 2;
//        int[] numbers = new int[4];
//        numbers[0] = pull(board, newLength, startX, startY);
//        numbers[1] = pull(board, newLength, startX, startY + newLength);
//        numbers[2] = pull(board, newLength, startX + newLength, startY);
//        numbers[3] = pull(board, newLength, startX + newLength, startY + newLength);
//
//        java.util.Arrays.sort(numbers);
//        return numbers[2];
    }
}