package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Movement {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] candy = new int[N + 1][M + 1];
		int[][] dpRes = new int[N + 1][M + 1];

		for (int i = 1; i < N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < M + 1; j++) {
				candy[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력 및 초기화 완료

		dpRes[1][1] = candy[1][1];

		//처음 생각한 코드
		for (int r = 2; r < N + 1; r++) {
			dpRes[r][1] += dpRes[r - 1][1] + candy[r][1];
		}

		for (int c = 2; c < M + 1; c++) {
			dpRes[1][c] += candy[1][c - 1] + candy[1][c];
		}

		for (int i = 2; i < N + 1; i++) {
			for (int j = 2; j < M + 1; j++) {
				dpRes[i][j] = Math.max(dpRes[i - 1][j], dpRes[i][j - 1]) + candy[i][j];
			}
		}
		System.out.println(dpRes[N][M]);
	}
}