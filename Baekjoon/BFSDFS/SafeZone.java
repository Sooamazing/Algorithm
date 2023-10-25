package Baekjoon.BFSDFS;

import java.util.Arrays;
import java.util.Scanner;

public class SafeZone {
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static int height_max;
	static int cnt_max;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		N = stdIn.nextInt();
		arr = new int[N][N];
		visited = new boolean[N][N];

		height_max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = stdIn.nextInt();
				height_max=Math.max(height_max, arr[i][j]);
			}
		}//height_max 저장하며 입력 완료,

		int cnt = 0;
		cnt_max = 0;
		for (int k = 0; k <= height_max; k++) {
			//height마다 cnt 및 방문 초기화
			cnt = 0;
			for (int i = 0; i < N; i++) {
				Arrays.fill(visited[i], false);
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//현재 높이와 같거나 낮은 경우, 이미 방문한 경우는 방문 처리 후 지나침.
					if (arr[i][j] <= k || visited[i][j]) {
						visited[i][j] = true;
						continue;
					}
					// System.out.println("height = " + k+", i = " + i+", j = " + j);

					//조건에 해당하는 경우, cnt
					cnt++;
					//방문 처리 후 탐색
					visited[i][j] = true;
					searchSafe(i, j, k);

					//cnt값이 max인지 비교 후 max 저장
					cnt_max=Math.max(cnt_max, cnt);
				}
			}

		}

		System.out.println(cnt_max);

	}

	//파라미터: 2차원 배열의 idx i, j 과 현재 최대 높이(물에 잠기는 높이)
	static void searchSafe(int left, int right, int height) {
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};

		for (int i = 0; i < 4; i++) {

			//갈 방향 idx temp에 저장
			//temp로 받지 않으면 left, right 값 그대로 반영되어 오류
			int templ = left + dx[i];
			int tempr = right + dy[i];

			//idx 오류 방지 위해 갈 수 있는 곳인지부터 확인
			if (templ >= 0 && templ < N && tempr >= 0 && tempr < N) {
				//가지 않은 곳이면 방문 처리 후 height보다 높은 곳이면 방문
				if (!visited[templ][tempr]) {
					visited[templ][tempr] = true;
					if (arr[templ][tempr] > height) {
						searchSafe(templ, tempr, height);
					}
				}
			}
		}
	}
}
