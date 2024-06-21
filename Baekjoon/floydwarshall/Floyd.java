package Baekjoon.floydwarshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-21
// https://www.acmicpc.net/problem/11404
public class Floyd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nodeNum = Integer.parseInt(br.readLine());
		int edgeNum = Integer.parseInt(br.readLine());

		int[][] roads = new int[nodeNum + 1][nodeNum + 1];

		StringTokenizer st;
		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());

			// 시작 도시와 도착 도시를 연결하는 노선은 하나가 아닐 수 있다.
			if (roads[a][b] == 0) {
				roads[a][b] = expense;
			} else {
				roads[a][b] = Math.min(roads[a][b], expense);
			}
		}

		floyd(roads);

		for (int i = 1; i <= nodeNum; i++) {
			for (int j = 1; j <= nodeNum; j++) {
				System.out.print(roads[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void floyd(int[][] roads) {
		for (int i = 1; i < roads.length; i++) {
			for (int j = 1; j < roads.length; j++) {
				for (int k = 1; k < roads.length; k++) {
					if (roads[j][i] != 0 && roads[i][k] != 0) {
						if (roads[j][k] == 0) {
							roads[j][k] = roads[j][i] + roads[i][k];
						} else {
							roads[j][k] = Math.min(roads[j][k], roads[j][i] + roads[i][k]);
						}
					}
				}
			}
		}
	}
}
