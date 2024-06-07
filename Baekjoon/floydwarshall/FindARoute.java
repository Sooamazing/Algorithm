package Baekjoon.floydwarshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-06-04 25min
// https://www.acmicpc.net/problem/11403
public class FindARoute {

	static boolean[][] map;
	static boolean[] visit;
	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		size = Integer.parseInt(st.nextToken());
		map = new boolean[size][size];
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < size; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()) == 1; // == 비교로 true, false 처리
			}
		}

		for (int i = 0; i < size; i++) {
			visit = new boolean[size];
			calc(i);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sb.append(map[i][j] ? 1 : 0).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

	static void calc(int curNode) {

		Queue<Integer> que = new LinkedList<>();
		que.add(curNode);

		while (!que.isEmpty()) {
			int tempNode = que.poll();
			visit[tempNode] = true;

			for (int i = 0; i < size; i++) {

				// 시작 정점
				if (i == curNode && map[tempNode][i]) {
					map[curNode][i] = true;
					continue;
				}

				if (map[tempNode][i] && !visit[i]) {
					map[curNode][i] = true;
					que.add(i);
				}
			}

		}

	}
}
