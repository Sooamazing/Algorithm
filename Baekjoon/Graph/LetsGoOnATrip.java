// https://www.acmicpc.net/problem/1976
package Baekjoon.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetsGoOnATrip {

	static int N;
	static int[][] graph;
	static int[] union;

	public static void main(String[] args) throws IOException {
		// N <= 200 // 도시의 수
		// M <= 1000 // 여행 계획에 속한 도시들의 수
		// A와 B가 연결되었으면 B와 A도 연결되어 있다
		// 마지막 줄에는 여행 계획

		// 끊어져 있는지 확인, union-find

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		graph = new int[N + 1][N + 1];
		int[] plan = new int[M];
		union = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			String[] split = br.readLine().split(" ");
			union[i] = i;
			for (int j = 1; j < N + 1; j++) {
				graph[i][j] = Integer.parseInt(split[j - 1]);
				graph[j][i] = graph[i][j];
			}
		}
		String[] split = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			plan[i] = Integer.parseInt(split[i]);
		}
		// 입력 및 초기화 완료

		// union & find 진행 - 끊어졌는지 확인
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {

				if (graph[i][j] != 0 && i != j) {
					int a = find(i);
					int b = find(j);

					if (a == b)
						continue;
					union(a, b);
				}

			}

		}

		// 여행 순서 M에서 끊어진 곳을 가는지 확인
		// 끊어져 있으면 NO, 다 통과하면 YES
		int next = -1;
		int cur = -1;
		for (int i = 0; i < M - 1; i++) {

			next = union[plan[i + 1]];
			cur = union[plan[i]];

			if (cur != next) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	static void union(int x, int y) {

		x = find(x);
		y = find(y);
		if (x < y) {
			union[y] = x;
		} else {
			union[x] = y;
		}

	}

	static int find(int x) {
		// 부모 찾기
		if (union[x] == x) {
			return x;
		} else {
			return union[x] = find(union[x]);
		}

	}

}
