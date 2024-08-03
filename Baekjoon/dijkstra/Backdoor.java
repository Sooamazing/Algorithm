package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-08-01 5min 08-03 45min
// https://www.acmicpc.net/problem/17396
// 반례: https://www.acmicpc.net/board/view/132322
public class Backdoor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());
		long[] expense = new long[nodeNum];
		Arrays.fill(expense, Long.MAX_VALUE);
		boolean[] isPossible = new boolean[nodeNum];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nodeNum; i++) {
			if (Integer.parseInt(st.nextToken()) == 0) {
				isPossible[i] = true;
			}
		}
		isPossible[nodeNum - 1] = true;

		List[] edges = new List[nodeNum];
		for (int i = 0; i < nodeNum; i++) {
			edges[i] = new ArrayList<long[]>();
		}
		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			edges[a].add(new long[] {b, c});
			edges[b].add(new long[] {a, c});

		}
		PriorityQueue<long[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Math.toIntExact(o1[0] - o2[0]);
			}
			return Math.toIntExact(o1[1] - o2[1]);
		});
		pq.add(new long[] {0, 0});
		expense[0] = 0;

		while (!pq.isEmpty()) {
			long[] poll = pq.poll();
			int curNode = (int)poll[0];
			long curExpense = poll[1];

			// System.out.print(curNode);
			// System.out.print(" ");
			// 시간 절약 위해 필요
			if (expense[curNode] < curExpense) {
				continue;
			}

			List<long[]> edge = edges[curNode];
			for (int i = 0; i < edge.size(); i++) {
				long[] nextInfo = edge.get(i);
				int nextNode = (int)nextInfo[0];
				long totalExpense = nextInfo[1] + curExpense;

				if (isPossible[nextNode]
					&& expense[nextNode] > totalExpense) {
					expense[nextNode] = totalExpense;
					pq.add(new long[] {nextNode, totalExpense});
				}
			}
		}

		if (expense[nodeNum - 1] == Long.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(expense[nodeNum - 1]);
		}

	}
}
