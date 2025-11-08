package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-08 10min
// https://www.acmicpc.net/problem/4493
public class RockScissorsPaper {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            int round = Integer.parseInt(br.readLine());

            int player1Score = 0;
            for (int i = 0; i < round; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char player1 = st.nextToken().charAt(0);
                char player2 = st.nextToken().charAt(0);
                int winner = whoIsWinner(player1, player2);
                player1Score += winner;
            }

            sb.append(player1Score > 0 ? "Player 1" : player1Score == 0 ? "TIE" : "Player 2")
                    .append("\n");
        }

        System.out.println(sb);
    }

    private static int whoIsWinner(char player1Symbol, char player2Symbol) {

        if (player1Symbol == player2Symbol) {
            return 0;
        }
        if ((player1Symbol == 'R' && player2Symbol == 'S')
                || (player1Symbol == 'S' && player2Symbol == 'P')
                || (player1Symbol == 'P' && player2Symbol == 'R')) {
            return 1;
        }
        // player2가 이기면
        return -1;
    }
}