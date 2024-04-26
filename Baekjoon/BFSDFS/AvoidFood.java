package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-04-26 20min
// https://www.acmicpc.net/problem/1743
public class AvoidFood {
	static int rowSize;
	static int columnSize;
	static int[][] hallway;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		rowSize = Integer.parseInt(st.nextToken());
		columnSize = Integer.parseInt(st.nextToken());
		int foodNum = Integer.parseInt(st.nextToken());

		hallway = new int[rowSize][columnSize];

		for (int i = 0; i < foodNum; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int column = Integer.parseInt(st.nextToken());
			hallway[row - 1][column - 1] = 1;
		}

		int max = 0;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (hallway[i][j] == 1) {
					hallway[i][j] += 1;
					int cur = findBiggestOne(i, j);
					max = Math.max(max, cur);
				}
			}
		}
		System.out.println(max);

	}

	static int findBiggestOne(int x, int y) {
		int[] dx = new int[] {0, 0, -1, 1};
		int[] dy = new int[] {-1, 1, 0, 0};

		int size = 1;
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];

			if (newX >= 0 && newX < rowSize
				&& newY >= 0 && newY < columnSize
				&& hallway[newX][newY] == 1) {

				// 이전에 방문한 수+1의 마지막이 항상 해당 SIZE와 같다는 보장이 없음.
				hallway[newX][newY] = hallway[x][y] + 1;
				size += findBiggestOne(newX, newY);
			}
		}
		return size;
	}
}
