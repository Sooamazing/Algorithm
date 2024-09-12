package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-30 15min
// https://www.acmicpc.net/problem/1504
public class SpecificShortestPath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		List<int[]>[] edges = new ArrayList[nodeNum + 1];
		for (int i = 0; i < nodeNum + 1; i++) {
			edges[i] = new ArrayList<>();
		}

		boolean[] visit = new boolean[nodeNum + 1];

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());

			edges[start].add(new int[] {end, expense});

		}

		st = new StringTokenizer(br.readLine());
		int stopBy_1 = Integer.parseInt(st.nextToken());
		int stopBy_2 = Integer.parseInt(st.nextToken());

		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			return o1[1] - o2[1];
		});
		pq.add(new int[] {1, 0});
		while (!pq.isEmpty()) {

			int[] poll = pq.poll();
			int curNode = poll[0];
			int curExpense = poll[1];

			if (visit[stopBy_1] && visit[stopBy_2]
				&& curNode == nodeNum) {

				System.out.println(curExpense);

				return;
			}

			// if (!visit[curNode]) {
			visit[curNode] = true;
			for (int[] eInfo : edges[curNode]) {
				int tempNode = eInfo[0];
				int tempExpense = eInfo[1];
				pq.add(new int[] {tempNode, curExpense + tempExpense});
			}
			// }

		}

		// 언제 -1인지 정확히 고민하기.
		System.out.println(-1);

	}
}
