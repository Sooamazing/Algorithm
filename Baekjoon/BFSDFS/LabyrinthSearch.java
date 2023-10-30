package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class LabyrinthSearch {

	static int N, M;
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new char[N + 2][M + 2];
		for (int i = 0; i < N + 2; i++) {
			Arrays.fill(arr[i], '0');
		}
		for (int i = 1; i < N + 1; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j + 1] = line.charAt(j);
			}
		}//입력 및 초기화 완료

		search(1, 1);
		System.out.println(arr[N][M] - '0');
	}

	static void search(int startLeft, int startRight) {

		int[][] dxdy = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startLeft, startRight});
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			for (int i = 0; i < 4; i++) {

				int tempX = poll[0] + dxdy[i][0];
				int tempY = poll[1] + dxdy[i][1];

				if (arr[tempX][tempY] == '1') {
					que.add(new int[]{tempX,tempY});
					arr[tempX][tempY] = (char)(arr[poll[0]][poll[1]] + '1' - '0');
				}

			}
		}
	}
}
