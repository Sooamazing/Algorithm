package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-13 15min
// https://www.acmicpc.net/problem/16174
public class JumpKingJjelly {
	static int size;
	static int[][] map;
	static final String SUCCESS = "HaruHaru";
	static final String FAIL = "Hing";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		map = new int[size][size];
		visited = new boolean[size][size];

		StringTokenizer st;
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < size; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(couldReachedToTheEnd() ? SUCCESS : FAIL);
	}

	static int[][] dir = new int[][] {{0, 1}, {1, 0}};
	static boolean[][] visited; // 없으면 메모리 초과

	static boolean couldReachedToTheEnd() {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {0, 0, map[0][0]});

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];
			int distance = poll[2];

			for (int i = 0; i < 2; i++) {
				int tempR = r + dir[i][0] * distance;
				int tempC = c + dir[i][1] * distance;
				if (tempR >= 0 && tempR < size
					&& tempC >= 0 && tempC < size
					&& !visited[tempR][tempC]) {

					// 끝점에 도달하는 경우, 도달 성공 -> true
					if (tempR == size - 1 && tempC == size - 1) {
						return true;
					}
					visited[tempR][tempC] = true;
					que.add(new int[] {tempR, tempC, map[tempR][tempC]});
				}
			}
		}
		return false;
	}
}
