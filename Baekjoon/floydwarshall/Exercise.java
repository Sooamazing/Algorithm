package Baekjoon.floydwarshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-06-18 100min
// https://www.acmicpc.net/problem/1956
public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeNum = Integer.parseInt(st.nextToken());
		int edgeNum = Integer.parseInt(st.nextToken());

		// 플로이드 워셜
		int[][] roads = new int[nodeNum + 1][nodeNum + 1];
		for (int i = 1; i <= nodeNum; i++) {
			for (int j = 1; j <= nodeNum; j++) {
				roads[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());

			roads[a][b] = expense;
		}

		for (int i = 1; i <= nodeNum; i++) {
			for (int j = 1; j <= nodeNum; j++) {
				for (int k = 1; k <= nodeNum; k++) {
					if (roads[i][j] != Integer.MAX_VALUE && roads[j][k] != Integer.MAX_VALUE) {
						roads[i][k] = Math.min(roads[i][k], roads[i][j] + roads[j][k]);
					}
				}
			}
		}

		int minExpense = Integer.MAX_VALUE;
		for (int i = 1; i <= nodeNum; i++) {
			for (int j = i + 1; j <= nodeNum; j++) {
				if (roads[i][j] != Integer.MAX_VALUE && roads[j][i] != Integer.MAX_VALUE) {
					minExpense = Math.min(minExpense, roads[i][j] + roads[j][i]);
				}
			}
		}

		// int minExpense = daikstraNotBingo(nodeNum, edgeNum, br);

		if (minExpense == Integer.MAX_VALUE) {
			minExpense = -1;
		}
		System.out.println(minExpense);
	}

	private static int daikstraNotBingo(int nodeNum, int edgeNum, BufferedReader br) throws IOException {
		StringTokenizer st;
		List[] adjList = new List[nodeNum + 1];
		for (int i = 1; i <= nodeNum; i++) {
			adjList[i] = new ArrayList<int[]>();
		}

		for (int i = 0; i < edgeNum; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());

			adjList[a].add(new int[] {b, expense});

		}

		int minExpense = Integer.MAX_VALUE;
		for (int i = 1; i <= nodeNum; i++) {

			PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
			que.add(new int[] {i, 0});
			// boolean[] visit = new boolean[nodeNum + 1];
			int[] visit = new int[nodeNum + 1];
			Arrays.fill(visit, Integer.MAX_VALUE);

			while (!que.isEmpty()) {
				int[] curInfo = que.poll();
				int curNode = curInfo[0];
				int curExpense = curInfo[1];

				// 시작점과 현재가 같은 경우 break
				if (curNode == i && curExpense != 0) {
					minExpense = Math.min(minExpense, curExpense);
					break;
				}

				// 이미 방문했던 비용이 더 적은 경우 지나침.
				if (visit[curNode] < curExpense) {
					continue;
				}

				// 시작 node 맨 처음 0인 경우 대비.
				// if (curNode == i && curExpense == 0) {
				// 	visit[curNode] = Integer.MAX_VALUE;
				// } else {
				// 	visit[curNode] = curExpense;
				// }

				List<int[]> curAdjList = adjList[curNode];
				for (int j = 0; j < curAdjList.size(); j++) {
					int[] adjNodeInfo = curAdjList.get(j); // 0 실수

					int adjNode = adjNodeInfo[0];
					int adjExpense = adjNodeInfo[1];
					int tempExpense = adjExpense + curExpense;
					// sum과 같을 때 해당 목적지까지의 거리는 변하지 않지만, 그 목적지로부터 새롭게 update를 해야되기 때문에 포함
					// adjNode == i || 조건에 이것도 필요?
					if (visit[adjNode] >= tempExpense) {
						// 여기서 비용 초기화하는 게 더 나은가?
						visit[adjNode] = tempExpense;
						que.add(new int[] {adjNode, tempExpense});
					}
				}
			}
		}
		return minExpense;
	}
}
