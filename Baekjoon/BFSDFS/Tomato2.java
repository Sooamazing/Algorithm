package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-05-17 50min
// https://www.acmicpc.net/problem/7569
public class Tomato2 {
	static int heightNum, rowNum, columnNum;
	static int[][][] tomatoes;
	static int unReapedNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		columnNum = Integer.parseInt(st.nextToken());
		rowNum = Integer.parseInt(st.nextToken());
		heightNum = Integer.parseInt(st.nextToken());

		tomatoes = new int[heightNum][rowNum][columnNum];
		Queue<int[]> que = new LinkedList<>();

		unReapedNum = 0;
		for (int i = 0; i < heightNum; i++) {
			for (int j = 0; j < rowNum; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < columnNum; k++) {
					int cur = tomatoes[i][j][k] = Integer.parseInt(st.nextToken());
					if (cur == 1) {
						que.add(new int[] {i, j, k});
					} else if (cur == 0) {
						unReapedNum++;
					}
				}
			}
		}

		// 이미 다 익은 경우 예외 처리.
		// 1 1 1
		// 1
		if (unReapedNum == 0) {
			System.out.println(0);
			return;
		}

		reapTomatoes(que);
		if (unReapedNum == 0) {
			System.out.println(days - 1);
		} else {
			System.out.println(-1);
		}

	}

	static int days;

	static void reapTomatoes(Queue<int[]> que) {

		int[] dx = new int[] {0, 0, 0, 0, 1, -1};
		int[] dy = new int[] {0, 0, 1, -1, 0, 0};
		int[] dz = new int[] {1, -1, 0, 0, 0, 0};

		while (!que.isEmpty()) {
			int[] cur = que.poll();

			// height, row, column
			for (int i = 0; i < 6; i++) {
				int newZ = cur[0] + dz[i];
				int newY = cur[1] + dy[i];
				int newX = cur[2] + dx[i];

				if (newX >= 0 && newX < columnNum
					&& newY >= 0 && newY < rowNum
					&& newZ >= 0 && newZ < heightNum
					&& tomatoes[newZ][newY][newX] == 0) {

					tomatoes[newZ][newY][newX] = tomatoes[cur[0]][cur[1]][cur[2]] + 1;
					unReapedNum--;
					days = Math.max(days, tomatoes[newZ][newY][newX]);

					que.add(new int[] {newZ, newY, newX});
				}
			}

		}

	}
}
