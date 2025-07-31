package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-07-31 20min
// https://www.acmicpc.net/problem/2804
public class MakingCrossword {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        String wordPerCol = st.nextToken();
        String wordPerRow = st.nextToken();
        char[][] board = new char[wordPerRow.length()][wordPerCol.length()];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
        int sameIndexOnWordPerCol = 0; // 1
        int sameIndexOnWordPerRow = 0; // 4
        Outer:
        for (int first = 0; first < wordPerCol.length(); first++) {
            for (int second = 0; second < wordPerRow.length(); second++) {
                if (wordPerCol.charAt(first) == wordPerRow.charAt(second)) {
                    sameIndexOnWordPerCol = first;
                    sameIndexOnWordPerRow = second;
                    break Outer;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            board[i][sameIndexOnWordPerCol] = wordPerRow.charAt(i);
        }
        board[sameIndexOnWordPerRow] = wordPerCol.toCharArray();
        for (int i = 0; i < wordPerRow.length(); i++) {
            for (int j = 0; j < wordPerCol.length(); j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}