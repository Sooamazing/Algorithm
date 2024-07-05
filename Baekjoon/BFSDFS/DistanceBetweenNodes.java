package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-05 25min
// https://www.acmicpc.net/problem/1240
public class DistanceBetweenNodes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int nodeNum = Integer.parseInt(st.nextToken());
		int resultNum = Integer.parseInt(st.nextToken());

		List[] edges = new List[nodeNum + 1];
		for (int i = 1; i <= nodeNum; i++) {
			edges[i] = new ArrayList<int[]>();
		}
		for (int i = 0; i < nodeNum - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());

			edges[node1].add(new int[] {node2, distance});
			edges[node2].add(new int[] {node1, distance});

		}
		int[][] results = new int[resultNum][2];
		for (int i = 0; i < resultNum; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			results[i][0] = node1;
			results[i][1] = node2;
		}

		for (int i = 0; i < resultNum; i++) {
			int[] result = results[i];
			int start = result[0];
			int end = result[1];

			int[] visited = new int[nodeNum + 1];

			PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
			pq.add(new int[] {start, 0});

			while (!pq.isEmpty()) {
				int[] poll = pq.poll();
				int node = poll[0];
				int expense = poll[1];

				if (visited[node] != 0)
					continue;
				if (node == end) {
					sb.append(expense).append("\n");
					break;
				}
				if (node != start) {
					visited[node] = expense;
				}

				List<int[]> edge = edges[node];
				for (int j = 0; j < edge.size(); j++) {
					int[] nearNodeInfo = edge.get(j);
					int nearNode = nearNodeInfo[0];
					int nearExpense = nearNodeInfo[1];

					if (visited[nearNode] == 0
						|| visited[nearNode] >= nearExpense + expense) {
						pq.add(new int[] {nearNode, nearExpense + expense});
					}
				}

			}
		}

		System.out.println(sb);

	}
}
