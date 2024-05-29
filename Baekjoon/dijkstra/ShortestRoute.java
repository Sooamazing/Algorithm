package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-29 40min
// https://www.acmicpc.net/problem/1753
public class ShortestRoute {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(br.readLine());

		int[] visit = new int[nodeNum + 1];
		Arrays.fill(visit, -1);

		PriorityQueue<int[]>[] edges = new PriorityQueue[nodeNum + 1];

		for (int i = 1; i <= nodeNum; i++) {

			edges[i] = new PriorityQueue<>((o1, o2) -> {
				return o1[1] - o2[1];
			});

		}

		for (int i = 0; i < edgeNum; i++) {

			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());
			edges[start].add(new int[] {end, expense});

		}

		PriorityQueue<int[]> daiksPq = new PriorityQueue<>((o1, o2) -> {
			return o1[1] - o2[1];
		});

		daiksPq.add(new int[] {startNode, 0});

		while (!daiksPq.isEmpty()) {

			int[] polls = daiksPq.poll();
			int curNode = polls[0];
			int curExpense = polls[1];

			if (visit[curNode] == -1) {

				// 첫 방문이면
				visit[curNode] = curExpense;

				while (!edges[curNode].isEmpty()) {
					int[] temp = edges[curNode].poll();
					daiksPq.add(new int[] {temp[0], temp[1] + curExpense});
				}

			}

			// 방문한 적 있으면 넘어가기.

		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= nodeNum; i++) {

			if (visit[i] == -1) {
				sb.append("INF\n");
			} else {
				sb.append(visit[i]).append("\n");
			}

		}

		System.out.println(sb);

	}
}
