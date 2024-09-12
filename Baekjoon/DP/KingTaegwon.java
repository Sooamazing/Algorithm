package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-08-12 40min - 틀림.
// https://www.acmicpc.net/problem/14562
public class KingTaegwon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int takyun = Integer.parseInt(st.nextToken());
			int goal = Integer.parseInt(st.nextToken());
			// Node[] dp = new Node[goal * 2 + 1];

			// 다익스트라
			int[] expenses = new int[goal * 3 + 1];
			// boolean[] visited = new boolean[goal * 2 + 1];
			Arrays.fill(expenses, Integer.MAX_VALUE);
			PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
				return o1[2] - o2[2]; // 나머지는 순서 상관 X
			});
			expenses[takyun] = 0;
			pq.add(new int[] {takyun, goal, 0});
			while (!pq.isEmpty()) {
				int[] poll = pq.poll();
				takyun = poll[0];
				goal = poll[1];
				int cnt = poll[2];

				if (takyun == goal) {
					break;
				}

				// if (expenses[takyun] <= cnt) {
				// 	continue;
				// }

				// +1만 하는 경우, goal보다 작거나 같고, 해당 cnt가 최소이면 추가.
				int takyunPlus1 = takyun + 1;
				if (takyunPlus1 <= goal
					&& cnt + 1 < expenses[takyunPlus1]) {
					expenses[takyunPlus1] = cnt + 1;
					pq.add(new int[] {takyunPlus1, goal, cnt + 1});
				}

				// 엄청난 연속 발차기로 2배가 되는 경우
				// 상대도 3점 더하고, 해당 cnt가 최소면 추가
				int takyunMultiple2 = takyun * 2;
				if (takyunMultiple2 <= goal + 3
					&& cnt + 1 < expenses[takyunMultiple2]) {
					expenses[takyunMultiple2] = cnt + 1;
					pq.add(new int[] {takyunMultiple2, goal + 3, cnt + 1});
				}

			}
			sb.append(expenses[goal]).append("\n");
		}

		System.out.println(sb);
	}

	static class Node {
		int takyunScore;
		int oppScore;
		int cnt;

		Node(int takyunScore, int oppScore, int cnt) {
			this.takyunScore = takyunScore;
			this.oppScore = oppScore;
			this.cnt = cnt;
		}
	}
}
