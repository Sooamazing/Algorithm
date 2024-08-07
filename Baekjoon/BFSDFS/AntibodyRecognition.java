package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-06 65min
// https://www.acmicpc.net/problem/22352
// 반례들 - 다 통과하는데, 왜 틀릴까.
// https://www.acmicpc.net/board/view/74076
// https://www.acmicpc.net/board/view/81399
public class AntibodyRecognition {
	static int row, col;
	static int[][] before, after;
	static boolean[][] visited;
	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		before = new int[row][col];
		after = new int[row][col];
		visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				before[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				after[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 전부 똑같은 경우 - YES - result: 0
		// 한 구역만 바뀐 경우 - YES - result: 1
		// 구역 중 일부만 바뀐 경우 - NO - result: -1
		// 두 구역 이상이 바뀐 경우 - NO - result: 1, boolean true;
		boolean isChanged = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (!visited[i][j]) {
					// bfs
					int tempRes = bfs(i, j);
					if (tempRes == -1) {
						// 구역 중 일부만 바뀐 경우 - NO
						System.out.println("NO");
						return;
					} else if (tempRes == 1) {
						if (isChanged) {
							System.out.println("NO");
							return;
						}
						isChanged = true;
					}
					// result = 0;
					// dfs(i, j, before[i][j], after[i][j]);
					// if (result == -1) {
					// 	// 구역 중 일부만 바뀐 경우 - NO
					// 	System.out.println("NO");
					// 	return;
					// } else if (result == 1) {
					// 	if (isChanged) {
					// 		System.out.println("NO");
					// 		return;
					// 	}
					// 	isChanged = true;
					// }
				}
			}
		}
		System.out.println("YES");
	}

	static int bfs(int startR, int startC) {

		int tempRes = before[startR][startC] == after[startR][startC] ? 0 : 1; // 0: 같은 경우, 1: 다른 경우
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});
		visited[startR][startC] = true;

		int stdAfterData = after[startR][startC];

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row
					&& tempC >= 0 && tempC < col
					&& !visited[tempR][tempC]
					&& before[r][c] == before[tempR][tempC]) {
					// 방문하지 않은, 같은 영역이면 방문.
					visited[tempR][tempC] = true;
					// 기준(첫) after 데이터와 현재 after 데이터가 다르면, -1 return
					if (stdAfterData != after[tempR][tempC]) {
						return -1;
					}
					que.add(new int[] {tempR, tempC});
				}
			}
		}
		return tempRes;
	}

	static int result;

	static void dfs(int r, int c, int beforeData, int pastAfterData) {

		visited[r][c] = true;
		int curBeforeData = before[r][c];
		int curAfterData = after[r][c];
		// 이전 before 데이터
		if (beforeData == curBeforeData) {
			if (pastAfterData != curAfterData) {
				result = -1;
				return;
			}
			if (beforeData != curAfterData) {
				result = 1;
			}
		} else {
			// 더이상 같지 않으면 종료.
			return;
		}

		for (int i = 0; i < 4; i++) {
			int tempR = r + dir[i][0];
			int tempC = c + dir[i][1];

			if (tempR >= 0 && tempR < row
				&& tempC >= 0 && tempC < col
				&& !visited[tempR][tempC]) {
				dfs(tempR, tempC, beforeData, pastAfterData);
			}
		}
	}
}
