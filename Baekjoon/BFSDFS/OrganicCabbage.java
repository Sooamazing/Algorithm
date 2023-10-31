// https://www.acmicpc.net/problem/1012
package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrganicCabbage {

	static boolean[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			arr = new boolean[N + 2][M + 2];

			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int tempX = Integer.parseInt(st.nextToken());
				int tempY = Integer.parseInt(st.nextToken());

				arr[tempX + 1][tempY + 1] = true;
			}
			//입력 및 초기화 입력

			int cnt =0;
			for (int j = 1; j < N + 1; j++) {
				for (int k = 1; k < M + 1; k++) {
					if(arr[j][k]){
						cnt++;
						arr[j][k] = false;
						dfs(j, k);

					}
				}
			}
			System.out.println(cnt);
		}
	}

	static void dfs(int left, int right){
		int[][] dxdy = {{1,0}, {-1,0}, {0,1}, {0,-1}};

		for(int i=0;i<4;i++){
			int tempX = left + dxdy[i][0];
			int tempY = right + dxdy[i][1];

			if(arr[tempX][tempY]){
				arr[tempX][tempY] = false;
				dfs(tempX, tempY);
			}
		}
	}
}
