package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-16, 17 90min
// https://www.acmicpc.net/problem/20165
// 반례: https://www.acmicpc.net/board/view/66054
public class TheDominoMasterOfPatienceHoseok {
	static int row;
	static int col;
	static int round;
	static int[][] domino;
	static boolean[][] isDown;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		round = Integer.parseInt(st.nextToken());

		domino = new int[row][col];
		isDown = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				domino[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int score = 0;
		while (round-- > 0) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()) - 1;
			int c = Integer.parseInt(st.nextToken()) - 1;
			String dir = st.nextToken();

			st = new StringTokenizer(br.readLine());
			int defenseR = Integer.parseInt(st.nextToken()) - 1;
			int defenseC = Integer.parseInt(st.nextToken()) - 1;

			int[] dirCoordi;
			// 방향에 따라 전진하는 좌표값 설정.
			switch (dir) {
				case "N":
					dirCoordi = new int[] {-1, 0};
					break;
				case "E":
					dirCoordi = new int[] {0, 1};
					break;
				case "S":
					dirCoordi = new int[] {1, 0};
					break;
				default:
					dirCoordi = new int[] {0, -1};
			}

			// 이미 쓰러진 곳이라면 도미노가 방문할 수 없음.
			if (!isDown[r][c]) {
				score += pullDominoes(r, c, dirCoordi, domino[r][c] - 1);
			}

			// 수비수가 세운 곳
			isDown[defenseR][defenseC] = false;

			// 문제를 잘못 이해한 풀이
			// score += dfs(r, c, dirCoordi, minR, maxR, minC, maxC);

			// if (!defenseSuc) {
			// 	isDown[r][c] = false;
			// 	score--;
			// }

		}
		sb.append(score).append("\n");
		for (boolean[] boo : isDown) {
			for (boolean v : boo) {
				sb.append(v ? "F" : "S").append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static int pullDominoes(int r, int c, int[] dir, int maxDistance) {
		int pulled = 1; // 초기화 값은 0이 아닌 1

		// 마주친 게 쓰러져 있으면, score에 포함X, 전진 여부와는 관계 X
		if (isDown[r][c]) {
			pulled--;
		}
		isDown[r][c] = true;

		int tempR = r + dir[0];
		int tempC = c + dir[1];

		// 앞으로 전진할 수 있는지 결정하는 건 maxDistance
		if (maxDistance > 0
			&& tempR >= 0 && tempR < row
			&& tempC >= 0 && tempC < col) {

			// 이미 쓰러져 있는 곳은 0
			// 쓰러져 있지 않은 곳이면, domino[tempR][tempC] - 1로 갈 수 있는 max 비교.
			if (isDown[tempR][tempC]) {
				maxDistance = Math.max(maxDistance - 1, 0);
			} else {
				maxDistance = Math.max(maxDistance - 1, domino[tempR][tempC] - 1);
			}
			pulled += pullDominoes(tempR, tempC, dir, maxDistance);
		}

		return pulled;
	}

	// 문제를 잘못 이해함...
	// static int dfs(int r, int c, int[] dir, int minR, int maxR, int minC, int maxC) {
	//
	// 	int dead = 1;
	// 	if (!isDown[r][c]) {
	// 		// return 0;
	// 		dead--;
	// 	}
	// 	if (r >= minR && r < maxR && r >= minC && r < maxC) {
	//
	// 		isDown[r][c] = true;
	// 		int tempR = r + dir[0];
	// 		int tempC = c + dir[1];
	// 		if (tempR >= minR && tempR < maxR && tempC >= minC && tempC < maxC) {
	// 			isDown[r][c] = true;
	// 			dead += dfs(tempR, tempC, dir, minR, maxR, minC, maxC);
	// 		}
	// 	}
	//
	// 	return dead;
	// }
}
