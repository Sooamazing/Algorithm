package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-03 20min
// https://www.acmicpc.net/problem/27737
public class MushroomFarm {

	static int[][] farm;
	static int farmSize;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		farmSize = Integer.parseInt(st.nextToken());
		int mushroomSporesNum = Integer.parseInt(st.nextToken());
		int maxSpreadSize = Integer.parseInt(st.nextToken());

		farm = new int[farmSize][farmSize];

		for (int i = 0; i < farmSize; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < farmSize; j++) {
				farm[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int curSpore = mushroomSporesNum;
		for (int i = 0; i < farmSize; i++) {
			for (int j = 0; j < farmSize; j++) {

				// 버섯이 자랄 수 있는 칸이 0
				if (farm[i][j] == 0) {
					int size = spread(i, j);
					curSpore -= (size / maxSpreadSize);
					if (size % maxSpreadSize != 0) {
						curSpore--;
					}
					if (curSpore < 0) {
						System.out.println("IMPOSSIBLE");
						return;
					}
				}
			}
		}

		if (curSpore == mushroomSporesNum) {
			// 버섯 포자를 하나라도 사용해야 함.
			System.out.println("IMPOSSIBLE");
			return;
		} else {
			System.out.println("POSSIBLE\n" + curSpore);
		}

	}

	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	static int spread(int r, int c) {
		// 방문 처리
		farm[r][c] = 1;

		int size = 1;

		for (int i = 0; i < 4; i++) {
			int tempR = r + dr[i];
			int tempC = c + dc[i];
			if (tempR >= 0 && tempR < farmSize
				&& tempC >= 0 && tempC < farmSize
				&& farm[tempR][tempC] == 0) {
				size += spread(tempR, tempC);
			}
		}
		return size;
	}
}
