package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-12 25min
// https://www.acmicpc.net/problem/27172
public class GameOfDividingNumbers {
	static int playerNum;
	static int[] players;
	static int[] result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		playerNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		players = new int[playerNum];
		result = new int[playerNum];

		for (int i = 0; i < playerNum; i++) {
			players[i] = Integer.parseInt(st.nextToken());
		}

		tempPlayers = new int[2];
		dfs(0, 0);

		for (int i = 0; i < playerNum; i++) {
			sb.append(result[i]).append(" ");
		}
		System.out.println(sb);

	}

	static int[] tempPlayers;

	// 시간 초과
	static void dfs(int idx, int depth) {
		if (depth == 2) {
			int tempPlayer1 = tempPlayers[0];
			int tempPlayer2 = tempPlayers[1];
			int tempP1Value = players[tempPlayer1];
			int tempP2Value = players[tempPlayer2];
			if (tempP1Value % tempP2Value == 0) {
				result[tempPlayer1]--;
				result[tempPlayer2]++;
			} else if (tempP2Value % tempP1Value == 0) {
				result[tempPlayer1]++;
				result[tempPlayer2]--;
			}
			return;
		}

		for (int i = idx; i < playerNum; i++) {
			tempPlayers[depth] = i;
			dfs(i + 1, depth + 1);
		}

	}
}
