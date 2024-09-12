package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-04-24 - 20min, 메모리 초과
// https://www.acmicpc.net/problem/1939
public class WeightLimit {

	static long max;
	static int[][] arr;
	static boolean[] visited;
	static int end;
	static int islandNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		islandNum = Integer.parseInt(st.nextToken());
		int rows = Integer.parseInt(st.nextToken());

		arr = new int[islandNum + 1][islandNum + 1];
		visited = new boolean[islandNum + 1];
		for (int i = 0; i < rows; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = weight;
		}

		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		// 입력 완료

		visited[start] = true;
		max = Integer.MIN_VALUE;
		findMax(Long.MAX_VALUE, start);

		System.out.println(max);

	}

	static void findMax(long min, int curSpot) {
		if (curSpot == end) {
			max = Math.max(max, min);
		}

		for (int i = 1; i <= islandNum; i++) {
			// 한 번도 가보지 않은 곳 중, 현재 장소와 이어져 있는 곳 방문
			//
			if (!visited[i]
				&& arr[curSpot][i] != 0) {
				visited[i] = true;
				findMax(Math.min(min, arr[curSpot][i]), i);
				visited[i] = false;
			}
		}

	}

}
