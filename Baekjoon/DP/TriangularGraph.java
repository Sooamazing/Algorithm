package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-24 40min
// https://www.acmicpc.net/problem/4883
// 참고: 0행 1열은 왼쪽에서도 올 수 있음. https://www.acmicpc.net/board/view/154410
public class TriangularGraph {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = 0;

		while (true) {
			testCase++;
			int row = Integer.parseInt(br.readLine());
			if (row == 0) {
				break;
			}
			StringTokenizer st;
			int[][] graph = new int[row][3];
			for (int i = 0; i < row; i++) {
				st = new StringTokenizer(br.readLine());
				int currentLeft = Integer.parseInt(st.nextToken());
				int currentMid = Integer.parseInt(st.nextToken());
				int currentRight = Integer.parseInt(st.nextToken());
				if (i == 0) {
					graph[0][0] = currentMid;
					graph[0][1] = currentMid;
					graph[0][2] = currentMid + currentRight;
					continue;
				}
				graph[i][0] = Math.min(graph[i - 1][0], graph[i - 1][1]) + currentLeft;
				graph[i][1] = Math.min(
					Math.min(graph[i][0], graph[i - 1][0]),
					Math.min(graph[i - 1][1], graph[i - 1][2])
				) + currentMid;
				graph[i][2] = Math.min(
					Math.min(graph[i][1], graph[i - 1][1]),
					graph[i - 1][2]
				) + currentRight;
			}
			sb.append(testCase + ". " + graph[row - 1][1] + "\n");
		}

		System.out.println(sb);
	}
}
